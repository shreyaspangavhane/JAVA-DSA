import java.util.Stack;

public class A4_Stack_Using_Collection_Framework {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
            //push Operation
        st.push(3);
        st.push(6);
        st.push(2);
        st.push(14);
        st.push(63);

            //pop operation
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
            
        }
    }
}
