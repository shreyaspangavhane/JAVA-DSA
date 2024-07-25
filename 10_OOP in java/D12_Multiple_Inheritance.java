
interface Education{
    void display();
    
}
interface School{
    void schoolname();
}

class Student implements Education, School{
    public void display(){        
        System.out.println("This is School class ");
    }
    public void schoolname(){
        System.out.println("ABCD COE");
    }
    
}


public class D12_Multiple_Inheritance{
    public static void main(String[] args) {
        Student stud=new Student();
        stud.display();
        System.out.println();
        stud.schoolname();
    }
}
