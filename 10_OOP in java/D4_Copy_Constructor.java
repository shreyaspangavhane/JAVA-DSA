class Student{      
    String name;
    int roll_no;
    
    Student(Student st2){      //here we make Copy constructor
        this.name=st2.name;                     
        this.roll_no=st2.roll_no;
    }
    Student(){
        
    }
    public void display(){           
        System.out.println("Name is: "+this.name);
        System.out.println("Roll no is :"+this.roll_no);
    }
}

public class D4_Copy_Constructor{     
    public static void main(String args[]){        
        Student st=new Student();
        st.name="SHREYAS";
        st.roll_no=101;

        Student st2=new Student(st);
        st2.display();


    }
}