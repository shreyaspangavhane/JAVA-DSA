abstract class Education{
    abstract void display();
    
    Education(){                //make the constructor of abstract class
        System.out.println("Constructor of Abstract class");
    }
}

class School extends Education{
    public void display(){        
        System.out.println("This is School class ");
    }
    School(){
        System.out.println("Destructor of School class");
    }
}

class College extends Education{
    public void display(){
        System.out.println("This is College class");
    }
    College(){
        System.out.println("this is constructor of college class");
    }
}

public class D10_Abstract_Class {
    public static void main(String[] args) {
        School sc=new School();
        sc.display();
        System.out.println();
        College clg=new College();
        clg.display();       
    }
}
