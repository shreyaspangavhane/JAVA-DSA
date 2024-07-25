public class Print_5_to_1_no{
    public static void Recursion1(int n){
        if (n==0) {         //  Base    n=0 then code be exit from loop
            return ;
        }
        System.out.println(n);   //print the number
        Recursion1(n-1);            //Recursion   - function call itself
    }
    
    
    public static void main(String[] args) {
        int n=5;
            Recursion1(n);
    }
}