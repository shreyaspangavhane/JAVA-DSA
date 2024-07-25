public class Diamondpattern{
    public static void main(String[] args) {
        
        //print Upper Part
        for (int i = 1; i <=4; i++) {
            
            //print space
            int spaces=(4-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }

            //print frist part
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            
            //print second part
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

        System.out.println();
       
         //print lower Part
        for ( i = 4; i >=1; i--) {
            
            //print space
             spaces=(4-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }

            //print frist part
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            
            //print second part
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

        System.out.println();
       

        }
    }
}

}