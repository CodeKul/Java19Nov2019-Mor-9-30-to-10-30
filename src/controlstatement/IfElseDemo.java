package controlstatement;

import java.util.Scanner;

public class IfElseDemo {


   private void ifElseDemo(int number){

       if (number%2==0){
           System.out.println(number+" is Even Number.");
       }
       else {
           System.out.println(number+" is Odd Number.");
       }

   }

   private void elseIfDemo(int mark){
       if (mark<35){
           System.out.println("Fail");
       }
       else if(mark>=35 && mark<60){
           System.out.println("Second class");
       }
       else if (mark>=60 && mark<75){
           System.out.println("First class");
       }
       else if (mark>=75 && mark<=100){
           System.out.println("Dist");
       }
       else {
           System.out.println("Invalid");
       }
   }

    public static void main(String[] args) {

       IfElseDemo demo=new IfElseDemo();
       System.out.print("Enter the number : ");
       Scanner scanner=new Scanner(System.in);
       int number=scanner.nextInt();
       //demo.ifElseDemo(number);
        demo.elseIfDemo(number);
    }

}
