import java.util.*;

public class A3_Occurance_of_ele_in_LL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    
        
    
    public void check_occurance(){
        int count=0;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number do you want to count Occurance");
        num=sc.nextInt();
        
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(1);
        list.addFirst(27);
        list.addFirst(56);
        list.addFirst(1);
        list.addFirst(59);
        list.addFirst(82);
        
        
        for (int i = 0; i <list.size(); i++) {    
            if (list.get(i)==num) {
                count++;   
            }
        }
        System.out.println("Occurrences of " + num + " in the linked list: " + count);
    }
    
    public static void main(String[] args) {
        A3_Occurance_of_ele_in_LL obj=new A3_Occurance_of_ele_in_LL();
        obj.check_occurance();
        
        
    }
    
}