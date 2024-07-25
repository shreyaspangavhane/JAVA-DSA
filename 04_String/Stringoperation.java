//Operation perform on string
//strings are immutable (not do changes after assign value)
public class Stringoperation{
    public static void main(String[] args) {
        // 1. concatenation ==>> Add two string
        String firstname="Vijay";
        String lastname="Thalapathy";
        String fullname= firstname +" "+lastname;
        System.out.println(fullname);

        // 2. Length==>>claculate the length of string 
                // stringname.length()
        System.out.println(fullname.length());

        // 3.charAt() ==>> stringname.charAt()   ==>>  select the charactor which present at position..    select using for loop
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        // 4. String Compare ==> if (string1.compareTo(string2)==0) if yes print message equal        
        if (firstname.compareTo(lastname)==0) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are NOT equal");
        }
    }
    
}
