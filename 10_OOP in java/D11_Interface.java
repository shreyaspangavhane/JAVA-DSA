/**
Interface-->> 
    - interface keyword
    - all data member are public static & final by default
    - all method and function are public and abstracvt by default
    - we achive multiple inheritance
    - class to interface ==use implement keyword
    - no constructor used
    */

interface Education{
    void display();
    
}

class School implements Education{
    public void display(){        
        System.out.println("This is School class ");
    }
    
}


public class D11_Interface {
    public static void main(String[] args) {
        School sc=new School();
        sc.display();
        System.out.println();
               
    }
}
