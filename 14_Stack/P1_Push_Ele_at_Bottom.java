//  Push the ellement in bottom of the stack
import java.util.*;

public class P1_Push_Ele_at_Bottom {
    
    static void pushatbottom(Stack<Integer> st,int n){  // is element who are add at bottom

        Stack<Integer> temp=new Stack<>();

        // Transfer all elements from st to temp
        while (!st.isEmpty()){          //remove the element from stack st and push into the stack temp
            temp.push(st.pop());       //top element of stack st is push into the temp stack
            
        }
        st.push(n);     //push the element at last

        // Transfer all elements from temp to st
        while (!temp.isEmpty()) {
            st.push(temp.pop());       
        }
        //display the stack ele
        while (!st.isEmpty()) {
            System.out.print(st.peek()+ " ");
            st.pop();
            
        }

        }
    
    
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(12);
        st.push(34);
        st.push(83);
        st.push(57);
        st.push(97);

        int n=100;

        pushatbottom(st,n);
        
    }

    
}