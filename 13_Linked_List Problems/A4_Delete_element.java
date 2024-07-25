import java.util.*;

public class A4_Delete_element {
    class Node{
        int data;
        Node next;

       // Node(int data){
         //   this.data=data;
        //}
    }
 
    public void Delete_element(){
        int count=0;
        int num;
        Scanner sc=new Scanner(System.in);
           
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(1);
        list.addFirst(27);
        list.addFirst(56);
        list.addFirst(1);
        list.addFirst(59);
        list.addFirst(82);
        System.out.println("The linked list is: "+list);
        
        System.out.println("Enter the number do you want to Remove");
        num=sc.nextInt();

        for (int i = 0; i <list.size(); i++) {    
            if (list.contains(num)) {
                System.out.println("Element Found!!");
                int idx=list.indexOf(num);
                list.remove(idx);
                System.out.println("Updated List is: "+list);
                
            return;  
                
            
            }
            else{
                System.out.println("Number not Found!!");
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        A4_Delete_element obj=new A4_Delete_element();
        obj.Delete_element();
        
        
    }
    
}