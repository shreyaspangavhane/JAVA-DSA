import java.util.*;
public class Array2Dformatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input of rows and column
        System.out.println("enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the number of column: ");
        int columns=sc.nextInt();
        int [][] matrix=new int[rows][columns];      //decleartion of array
         
        // read array element
        
        System.out.println("enter the array element: ");
        for (int i = 0; i <rows; i++) {         //control rows
            for (int j = 0; j <columns; j++) {            //control column
                matrix[i][j]=sc.nextInt();
            }
        }
        //display array elements
        
        System.out.println("The array element is: ");
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
