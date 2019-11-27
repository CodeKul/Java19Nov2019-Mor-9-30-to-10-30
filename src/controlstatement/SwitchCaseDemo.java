package controlstatement;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        System.out.println("1. Add\n2. Sub\n3. Mul");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        switch (choice){

            case 1:
                System.out.println("add :"+(10+20));
                break;
            case 2:
                System.out.println("sub :"+(10-20));
                break;
            case 3:
                System.out.println("mul :"+(10*20));
                break;
        default:
            System.out.println("Invalid");

        }



    }
}
