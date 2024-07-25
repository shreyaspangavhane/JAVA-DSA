//this keywords in Constructor ==>>
        // when we make constructor with same argument name which are already in that   class then we use this keyword

class Student{      
    String name;
    int roll_no;
    
    Student(String name, int roll_no){      //here we make paramertized constructor
        this.name=name;                     
        this.roll_no=roll_no;
    }
    public void display(){           
        System.out.println("Name is: "+this.name);
        System.out.println("Roll no is :"+this.roll_no);
    }
}

public class D3_Parametrized_Constructor{     
    public static void main(String args[]){        
        Student st=new Student("SHREYAS", 101); //here the constructor is automatically called
        st.display();


    }
}