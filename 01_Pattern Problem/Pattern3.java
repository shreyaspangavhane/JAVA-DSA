public class Pattern3 {
    public static void main(String[] args) {
        for (int i =1; i <=4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();   
        }

            //print number is ABOVE pattern
            System.out.println();
            System.out.println();
          
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <=i; j++) {
                System.out.print(" "+ j);
            }
            System.out.println();
        }  
       
    }
}
