public class Numberpyramid {
    public static void main(String[] args) {
        //number pyramid for 1 2 3 4 5 in last line same output
        for (int i = 1; i <=5; i++) {
            //print spaces
            int spaces=(5-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }

            //print numbers
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);
            }

        System.out.println();
        }   

        System.out.println();

         //number pyramid for 5 5 5 5 5 in last line same output and in frist line 1
        for (int i = 1; i <=5; i++) {
            //print spaces
            int spaces=(5-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }

            //print numbers
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+i);
            }

        System.out.println();
        }
    }
}
