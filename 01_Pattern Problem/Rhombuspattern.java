public class Rhombuspattern {
    public static void main(String[] args) {
        //print RHOMBUS
        for (int i = 1; i <=5; i++) {
           
            //print spaces

            int spaces=(5-i);    
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
        
                //print star
            for (int j = 1; j <=5; j++) {

                
                    System.out.print("*");    
                
                
            }
        System.out.println();
        }

    }
}
