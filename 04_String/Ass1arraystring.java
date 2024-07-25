//read array of string and calculate its length

import java.util.*;
public class Ass1arraystring {
    public static void main(String[] args) {
       System.out.println("enter the string size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arrlength=0;

        String[] arr=new String[size];
         System.out.println("Enter Array string: ");
        for (int i = 0; i <= size; i++) {
            arr[i]=sc.nextLine();
           
        }
        System.out.println("Array string is: ");
         for (int i = 0; i <= size; i++) {
            System.out.println(arr[i]);
         }
          for (int i = 0; i <= size; i++) {
            arrlength +=arr[i].length();
          }
          System.out.println("array length is: "+arrlength);
    }
    
}
