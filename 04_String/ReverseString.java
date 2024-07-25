public class ReverseString {
    public static void main(String[] args) {
    
        StringBuilder sb=new StringBuilder("YASH");
        System.out.println("String will be: ");

        //Reverse of string
        for (int i = 0; i < sb.length()/2; i++) {
            int front= i;
            int back= sb.length() -1-i ;
            
            char frontChar=sb.charAt(front);  //store front char at frontChar and same for back
            char backChar=sb.charAt(back);

            //set front to back and back to front
            sb.setCharAt(front, backChar); 
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }
}
