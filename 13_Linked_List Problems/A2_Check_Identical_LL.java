import java.util.*;
//check the identical element between two list
public class A2_Check_Identical_LL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
 
    public void check_Identity_Element(){
        //Add element
        //1st linked list
        LinkedList<Integer> list1=new LinkedList<>();
        list1.addFirst(1);
        list1.addFirst(27);
        list1.addFirst(56);
        list1.addFirst(1);
        list1.addFirst(59);
        list1.addFirst(82);

        //2nd linked list
        LinkedList<Integer> list2=new LinkedList<>();
        list2.addFirst(15);
        list2.addFirst(27);
        list2.addFirst(45);
        list2.addFirst(48);
        list2.addFirst(29);
        list2.addFirst(100);
        
        //check identity
        for (int i = 0; i <list1.size(); i++) {    
            if (list1.get(i)==list2.get(i)) {
                int num=list1.get(i);
                System.out.println("The element "+num+" is identical in LL");
            }
            
        }
    }
    
    public static void main(String[] args) {
        A2_Check_Identical_LL obj=new A2_Check_Identical_LL();
        obj.check_Identity_Element();
        
        
    }
    
}