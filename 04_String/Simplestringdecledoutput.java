import java.util.*;
public class Simplestringdecledoutput{
    public static void main(String[] args) {
        //decleration
        String name="tony stark";

        //taking input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the only first name");
        String name1=sc.next();     //for only one word accept

        System.out.println("enter the full name");
        String full_name=sc.nextLine();      //for more then one word
    
        //display string
        System.out.println("name is:"+name);
        System.out.println("input name is:"+name1);
        System.out.println("name is:"+full_name);
    }
} 