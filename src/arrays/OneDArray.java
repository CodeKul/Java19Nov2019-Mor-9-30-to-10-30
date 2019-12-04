package arrays;

import java.util.Scanner;

public class OneDArray {

    private int[] showArray(){

        int array[]={1,2,3,4,5};

        int array1[]=new int[10];

        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array1.length;i++){
            System.out.print("Enter the value for "+i+" : ");
            array1[i]=scanner.nextInt();
        }
        return array1;
    }


    public static void main(String[] args) {
        OneDArray oneDArray=new OneDArray();
        for (int a:oneDArray.showArray()
             ) {
            System.out.println("array data  : "+a);
        }
    }

}
