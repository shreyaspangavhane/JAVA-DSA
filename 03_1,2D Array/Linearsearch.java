import java.util.*;
public class Linearsearch{
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //read array size
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int [] A=new int[size];   //decleration of Array

        //read array element
        System.out.println("enter the array element");
        for (int i = 0; i <size; i++) {
            A[i]=sc.nextInt();
        }

        //read element to be search
        System.out.println("enter the element to be search");
        int ele=sc.nextInt();
    
        int flag=0;
        //check the element where is it present
        for (int i = 0; i <size; i++) {
            if(ele==A[i]){
                System.out.println("Element "+ele+" is present at "+i+"  position");
                flag=1;
            }
        }
            //check flag
            if (flag==0) {
                System.out.println("element is not found :: enter the correct element");
            }
        
        

    }

}
