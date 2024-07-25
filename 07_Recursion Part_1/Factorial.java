public class Factorial {
    public static void factorial_of_no(int fact, int i, int n)
        {
            if(i==n){
                fact*=i;
                System.out.println(fact);
            return;
            }
            
            fact*=i;

            factorial_of_no(fact, i+1, n);
        }
    public static void main(String[] args) {
       
       
    // without RECURESION
    /**    int fact=1;
        for ( int i = 1; i <6; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    */
        factorial_of_no(1, 1, 5);
    }
}
