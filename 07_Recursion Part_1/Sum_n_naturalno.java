public class Sum_n_naturalno {
    
    public static void Sum_n_naturalno(int i,int n,int sum){
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;

        }
       
        sum+=i;
        Sum_n_naturalno(i+1, n, sum);
    }
    public static void main(String[] args) {
        Sum_n_naturalno(1, 5, 0);
    }
}
