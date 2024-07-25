//Static :- if make this property as static it mean we assign ant value it never change
        // we make common property as static ;
        //we called  the static member by using class name and . operator 

class Student{
    String name;
    static String college_name;     //here the college name is common for all student so we make collge_name as static
} 
public class D13_Static_keyword {
    public static void main(String[] args) {
        Student stud=new Student();
        stud.name="SHREYAS";
        System.out.println(stud.name);

        Student.college_name="SCOE";   // call  the static variable by using class name
        System.out.println(Student.college_name);
    
        // for multiple object
        /**Student stud2=new Student();
        stud2.name="SHREYAS";
        System.out.println(stud2.name);

        Student.college_name="SCOE";   
        System.out.println(Student.college_name);
    
    */
    }
}