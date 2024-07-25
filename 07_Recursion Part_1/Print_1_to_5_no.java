public class Print_1_to_5_no {
    public static void Recursion2(int n){
        if(n==5){
        return;
        }
        System.out.println(n);
         Recursion2(n+1);
    }
    public static void main(String[] args) {
        int n=1;
    Recursion2(n);
    }
}
