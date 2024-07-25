//already add delete size function are there in linkedlist
import java.util.*;
import java.util.LinkedList;

public class A6_Single__LL_Collection_Freamwork {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);

        //add element
        ll1.addFirst("Ram");
        ll1.addFirst("Sai");
        ll1.addFirst("Ganesh");
        ll1.addLast("Om");
        System.out.println(ll1);

        //print the list
        for (int i = 0; i < ll1.size(); i++) {
            System.out.print(ll1.get(i)+"->");
        }
        System.out.println("Null");

        System.out.println("Enter the element do you want to search: ");
        String ele=sc.nextLine();
        
        //searching
        for (int i = 0; i < ll1.size(); i++) {
            if(ll1.get(i)==ele){
                System.out.println("Element found!! at position "+i);

            }
        }

        //size of element
        System.out.println("Size is: "+ll1.size());

        //remove the ele
        ll1.removeFirst();
        System.out.println(ll1);

        ll1.removeLast();
        System.out.println(ll1);

        

    }

    
}