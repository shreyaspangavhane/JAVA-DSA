public class Butterflypattern{
    public static void main(String[] args) {
        
        //upper part
        for (int i = 1; i <=5; i++) {
            
            // frist part
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            //print spaces
            int spaces=2*(5-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
 
            //For part Second
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }

        
        //lower part
        for (int i =4; i >=1; i--) {
            
            // frist part
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            //print spaces
            int spaces=2*(5-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }

            //For part Second
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }


    }
}