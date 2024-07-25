public class Pattern4 {
    public static void main(String[] args) {
        //print pattern into reverse order
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //print number in above format
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);
            }
        System.out.println();
        }
   
  
    }
    
}
