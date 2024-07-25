import java.util.*;
public class Que1234{
    //  Q.1 
       public static int avg(int a,int b, int c){
        int average = (a+b+c)/3;
            return average;
    }

    //  Q+.2
    public static int sumodd(int n){
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println("the addition of number from 1 to "+n+" will be: "+sum);
    
        return n;
    }

    //  Q.3
    public static int greatest(int m,int o){
        if (m>o){
            System.out.println(m+" is greater then "+o);
        }

        else{
            System.out.println(m+" is smaller than "+o);
        }
        return 0;
    }
   
    //Q.4
    public static int circumfrence(int r){
        double cum=(2*3.14*r);
        System.out.println("the circumfrence will be: "+cum);
    return 0;
    }
   
   
   
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    
    //Q.1
       System.out.println("enter the 3 numbers for calculate average: ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
        System.out.println("the average will be: "+avg(a,b,c));
    
    //Q.2 
        System.out.println("enter the nth number to calculate the sum: ");
        int n=sc.nextInt();
        sumodd(n);

    //Q.3
        System.out.println("Enter the any two number to check for comparison");
        int m=sc.nextInt();
        int o=sc.nextInt();
        greatest(m, o);    

    //Q.4
        System.out.println("enter the radius to check circumfrence: ");
        int r=sc.nextInt();
        circumfrence(r);
}

}