
//for printing stars follows these steps
//         i> star for i loop
//         ii> print spaces using for j loop
//         iii> print 1st part
//         iv>  print 2nd part

public class Triangle_Star {
    public static void main(String args[] ){
        
        for (int i = 1; i <=4; i++) {
            //print spaces

            int space=4-i;
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }

            //for first half
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }

            //for second half
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }        

        System.out.println();
        System.out.println();
        
//print number of triangle
        for (int i = 1; i <5; i++) {
            int space=5-i;
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);

            }
        
            System.out.println();
        }
    }
    
}
