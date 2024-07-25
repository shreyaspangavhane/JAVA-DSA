import java.util.Stack;

public class P2_Reverse_of_Stack {
    
    public static void Reverse(Stack<Integer>st){
        Stack<Integer> st2=new Stack<>();
        while(!st.empty()){
            int temp=st.peek();     //assign the top value to temp var

            st.pop();   //remove that top int

            st2.push(temp); //push that temp var to another stack st2

        }
        while (!st2.empty()) {
            System.out.print(st2.peek()+" ");
            st2.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        
        st.push(12);
        st.push(34);
        st.push(83);
        st.push(57);
        st.push(97);
        
        Reverse(st);

        
    }
}
