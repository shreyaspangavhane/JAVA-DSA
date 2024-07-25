//setter==>> assign the new value to private var;
//getter==>> return the value of private var which is set by setter;

class Personal{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){    //return the get method
        //automatically call the setter method
        return this.password;
    }

    public void setPassword(String pass){     //set the method
        this.password=pass;
    }
}

public class D8_Getter_Setter {
    public static void main(String[] args) {
        Personal p=new Personal();
        p.name="SHREYAS";
        p.email="shreyas@gmail.com";
        p.setPassword("abcd");      //set the value to the variable
        System.out.println(p.getPassword());       //print the value which will assign by setter method
    }
    
}