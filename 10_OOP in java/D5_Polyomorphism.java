/*polymorphism-->>
        single entity behave diffent in differnt instance.
        2 types=    
            1) Method Overloading = Compile time
            2) Method Overidding = Runtime 

        */
class Student{
    String name;
    int roll_no;
    public static void data(String name){
        System.out.println(name);
    }
    public static void data(int roll_no){
        System.out.println(roll_no);
    }
    public static void data(String name,int roll_no){
        System.out.println(name+" "+roll_no);
    }
}
public class D5_Polyomorphism{
    public static void main(String[] args) {
        Student st=new Student();
        st.name="SHREYAS";
        st.roll_no=101;
        st.data(st.name,st.roll_no);
    }
}