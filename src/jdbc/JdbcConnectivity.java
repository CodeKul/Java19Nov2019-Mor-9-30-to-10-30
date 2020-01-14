package jdbc;


import inheritance.Calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JdbcConnectivity {

    public void getDataFromDatabase() throws ClassNotFoundException, SQLException, FileNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager
                .getConnection("jdbc:mysql://localhost:3306/javamorningbatch","root","melayer1");

        Statement stmt=con.createStatement();
        System.out.println(saveData(con)+" records are inserted.");
        ResultSet resultSet=stmt.executeQuery("select * from student");
        while (resultSet.next()){
            System.out.println("Id : "+resultSet.getInt(1)+"\nName : "+resultSet.getString(2)+"\nAddress : "+resultSet.getString(3)+"\n\n");
        }
    con.close();
    }

    private int saveData(Connection con) throws SQLException, FileNotFoundException {
        System.out.print("Enter id,name and address : ");
        Scanner scanner=new Scanner(System.in);
        String sql="insert into student values(?,?,?)";
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setInt(1,scanner.nextInt());
        statement.setString(2,scanner.next());
        statement.setString(3,scanner.next());
        //statement.setCharacterStream(4,fr,(int) file.length());
        int i=statement.executeUpdate();
        return i;
    }

    private void checkDateTime() throws Exception {

        Calendar calendar=Calendar.getInstance();

    }

    public static void main(String[] args) throws Exception {
        JdbcConnectivity connectivity=new JdbcConnectivity();
        //connectivity.getDataFromDatabase();
        connectivity.checkDateTime();
    }
}
