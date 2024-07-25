import java.util.*;
public class Simplefunction{
    
    public static void printMyName(String name){    //function decleartion
        System.out.println("Yourname is :"+name);
        return;
    }


    public static void main(String[] args) {     //Main function or method
        System.out.println("Enter your name");
        Scanner sc=new Scanner (System.in);
        String name=sc.next();
        
        printMyName(name);

    }
}