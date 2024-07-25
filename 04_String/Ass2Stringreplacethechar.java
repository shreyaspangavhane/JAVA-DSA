import java.util.Scanner;

public class Ass2Stringreplacethechar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String original=sc.nextLine();
        StringBuilder sb=new StringBuilder(original);//make string builder of original
        sb.setCharAt(0, 'i');
        System.out.println(sb);
    }
}
