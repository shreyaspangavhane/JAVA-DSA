import java.util.*;
public class Sum2numbersbyfunction {
    
    public static int  cal_Sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int cal_mul(int a,int b){
        return a*b;
    }
        public static void main(String[] args) {
            System.out.println("Enter two Numbers");
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
           int b=sc.nextInt();

           int sum= cal_Sum(a,b);
        System.out.println("the sum will be:"+sum);

        System.out.println("The product will be: "+cal_mul(a, b));
    }
}
