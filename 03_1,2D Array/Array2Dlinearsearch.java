import java.util.*;
public class Array2Dlinearsearch {
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
           
            //enter the element to be search
            System.out.println("Enter the element to be search: ");
            int ele=sc.nextInt();

            int flag=0;     //delecred flag is zero
            for (int i = 0; i <rows; i++) {         //control rows
                for (int j = 0; j <columns; j++) {            //control column
                    if(ele==matrix[i][j]){
                        System.out.println("The element "+ele+" is present at "+i+","+j+" position");
                        flag=1;
                    }
                }
            }
            if (flag==0) {
                System.out.println("element is not found");
            }

        }
    }
    
