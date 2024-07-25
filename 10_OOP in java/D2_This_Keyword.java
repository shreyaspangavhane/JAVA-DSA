//this keywords ==>> it tell us that which object is try to access that method


class Sub_class{      //create another class
    String name;
    int roll_no;
 
    public void display(){          //method 
        System.out.println("Name is: "+this.name);
        System.out.println("Roll no is :"+this.roll_no);
    }
}

public class D2_This_Keyword{     // main class
    public static void main(String args[]){         //main method
        
        Sub_class obj=new Sub_class();          //create object
        obj.name="SHREYAS";     //intialize the value
        obj.roll_no=101;        //intialize the value

        // create another object to store the second student data
        Sub_class obj2=new Sub_class();
        obj2.name="SAI";
        obj2.roll_no=56;

        obj.display();    
        System.out.println();      // call the method using objname and . operator
        obj2.display();
        
    }
}