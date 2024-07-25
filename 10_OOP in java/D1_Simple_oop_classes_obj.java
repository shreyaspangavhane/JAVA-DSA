// new ==>> used to create object of class
        // it create the memory space where the data of object will be stored

class Sub_class{      //create another class
    String name;
    int roll_no;
 
    public void display(){          //method 
        System.out.println("Name is: "+name);
        System.out.println("Roll no is :"+roll_no);
    }
}

public class D1_Simple_oop_classes_obj{     // main class
    public static void main(String args[]){         //main method
        
        Sub_class obj=new Sub_class();          //create object
        obj.name="SHREYAS";     //intialize the value
        obj.roll_no=101;        //intialize the value

        obj.display();          // call the method using objname and . operator

        
    }
}