

import java.util.Scanner;
import java.util.Stack;

public class A2_Linked_List_of_Stack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;        // next value will be null
        }
    }

    class Stack {
        Node head;              // it is the variable where the LL is pointing

        public boolean isEmpty() {              // check if the stack is empty
            return head == null;                // if yes, then return true
        }

        public void push(int data) {            // push method
            Node newnode = new Node(data);      // create the new node
            if (isEmpty()) {                    // if empty then perform the next operation
                head = newnode;                 // assign where the new node is pointing to the head
                return;                         // return from the method
            }
            newnode.next = head;                // if not empty, after the next, that position is pointing to the top
            head = newnode;                     // then the value of next will be the head
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return 1;
            }
            int top = head.data;                // where the top is pointing, there data will be held
            head = head.next;                   // point to the next element of the head element
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return 1;
            }
            return head.data;
        }

        public void display(){
            if (isEmpty()) {
                System.out.println("Stavk is Empty");
                
            }
            else{
                System.out.println("Stack element is:");
                while (head!=null) {
                    System.out.println(head.data+" ");
                    head=head.next;
                    
                }
            }

        }
        
    }

    public static void main(String[] args) {
        A2_Linked_List_of_Stack obj = new A2_Linked_List_of_Stack();
        A2_Linked_List_of_Stack.Stack st = obj.new Stack();         // Creating an instance of the inner Stack class
        st.isEmpty();
        Scanner sc = new Scanner(System.in);
        // int ele = sc.nextInt();
        // System.out.println("Enter the want to push");
        st.push(3);
        st.push(6);
        st.push(2);
        st.push(14);
        st.push(63);

        st.pop();
        st.pop();
        st.display();
    }
}
