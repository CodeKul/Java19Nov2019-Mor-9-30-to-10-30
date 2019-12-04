package arrays;

public class TwoDArray {


    private void showArray(){

        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        new TwoDArray().showArray();
    }

}
/*

9 8 7
6 5 4
3 2 1

7 4 1
8 5 2
9 6 3

3 2 1
6 5 4
9 8 7
*/
