public class Fibonacci_Series {

    public static void fibonacci(int i,int n,int first,int second,int next){
        if (i==n) {
            return;
        }
        System.out.print(first+" ");
            next=first+second;    
            first=second;
            second=next;    
            
        fibonacci(i+1, n, first, second, next);

    }
    public static void main(String[] args) {
        
        //without using Recursion
        /**int n=10;  // calculate fibonacci for n=5
        int first=0;
        int second=1;
        int next;
        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            next=first+second;     //find next term by add first and second
            first=second;           //assign second to frist
            second=next;            //assign second to next number
        }
    */
    fibonacci(0, 10,0,1,0);
    }
}
