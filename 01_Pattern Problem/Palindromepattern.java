public class Palindromepattern{
    public static void main(String[] args) {
        
        for (int i = 1; i <=5; i++) {
            
            //print space
            int spaces=(5-i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }

            //for frist part

            for (int j =i; j >=1; j--) {
                System.out.print(j);
                
            }
            
            //for second part

            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
        System.out.println();
        }
    }

}