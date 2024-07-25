import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class A3_Array_list {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    class Stack{
        ArrayList<Integer>list=new ArrayList<>();
        public boolean isEmpty(){
           return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public void Pop(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                
            }
            else{
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
           // System.out.println(top);
            }
        }

        public void Peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");   
            }
            else{
                System.out.println( list.get(list.size()-1));
            }
        }

        public void display(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");   
            }
            else{
                System.out.println("Stack is: "+list);
            }
        }
}
    public static void main(String[] args) {
        A3_Array_list obj =new A3_Array_list();
        A3_Array_list.Stack st=obj.new Stack();
        st.push(3);
        st.push(6);
        st.push(2);
        st.push(14);
        st.push(63);

        st.display();
        System.out.println("Stack After the Pop Operation");
        st.Pop();
        st.Pop();

        st.display();

        System.out.print("Peek Of Stack is:");
        st.Peek();
        
        
    }
    
}
