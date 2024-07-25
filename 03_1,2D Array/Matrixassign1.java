//program for print matrix and take inoput from user

import java.util.*;
public class Matrixassign1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //read the size of martix
        System.out.println("enter the number of rows in Matrix: ");
        int n=sc.nextInt();
        System.out.println("enter the number coloumns in Matrix: ");
        int m=sc.nextInt();

        //read the element in matrix
        int[][] matrix=new int[n][m];
        System.out.println("enter the elements in a matrix");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               matrix[i][j]=sc.nextInt(); 
            }
        }
        //print the Matrix element 
        System.out.println("The matrix element be: ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
            }
    
} 