package aggregation;

public class Employee {

    int id;
    String name;
    String address;
    double salary;
    Company company;

    public Employee(int id, String name, String address, double salary, Company company) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.company = company;
    }

    private void displayData(){

        System.out.println(
                "empId : "+id+"\n"+
                "empName : "+name+"\n"+
                "empAddress : "+address+"\n"+
                "empSalary : "+salary+"\n"+
                "cmpId : "+company.id+"\n"+
                "cmpName : "+company.name+"\n"+
                "cmpAddress : "+company.address
        );


    }

    public static void main(String[] args) {

        Company company=new Company(1,"Melayer","Pune");
        Employee employee=new Employee(1,"abcd","Pune",50000,company);
        employee.displayData();
        

    }


}
