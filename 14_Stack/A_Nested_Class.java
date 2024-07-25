public class A_Nested_Class {
    class Inner{
        public void display(){
            System.out.println("This is the inner class");
        }
    
    } 
    public void print(){
        System.out.println("This is the outer class");
    }
    //main method
    public static void main(String[] args) {
        //1st create obj of outer class
        A_Nested_Class obj=new A_Nested_Class();

        //now create the obj of inner class by following syntax
        //  OuterClass.InnerClass obj2_name = new obj_Of_Outer_Class

        A_Nested_Class.Inner obj2= obj.new Inner();
        
    }
}
