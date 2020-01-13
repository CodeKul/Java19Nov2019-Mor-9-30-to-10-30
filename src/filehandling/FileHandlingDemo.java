package filehandling;

import com.sun.org.apache.bcel.internal.generic.DADD;

import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {

    void saveData(String data) throws IOException {
        File file=new File("/home/melayer-01/filesdata/10Jan2020.txt");
        FileOutputStream outputStream=new FileOutputStream(file);
        byte[] bytes=data.getBytes();
        outputStream.write(bytes);
        outputStream.close();
    }

    void readData() throws IOException{

        FileInputStream inputStream=new FileInputStream("/home/melayer-01/filesdata/10Jan2020.txt");
        int input=0;
        while ((input=inputStream.read())!=-1){
            System.out.print((char) input);
        }
        inputStream.close();


    }

    void saveFromBufferWriter(String data) throws IOException {
        FileWriter writer=new FileWriter("/home/melayer-01/filesdata/10Jan2020.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write(data);
        bufferedWriter.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {

        //Scanner scanner=new Scanner(System.in);
        InputStreamReader streamReader=new InputStreamReader(System.in);
        BufferedReader scanner=new BufferedReader(streamReader);
        System.out.print("Enter your message : ");
        String data=scanner.readLine() ;
        FileHandlingDemo handlingDemo=new FileHandlingDemo();
        //handlingDemo.saveData(data);
        handlingDemo.saveFromBufferWriter(data);
     /*   FileHandlingDemo handlingDemo=new FileHandlingDemo();
        handlingDemo.readData();*/

        int a=10;
       // int b= a++;//a=11 b=10
        int b= ++a;//a=11 b=11


    }

}
