public class Reverse_of_String{
    public static void rev_str(String str, int idx){
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        rev_str(str, idx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        rev_str(str, str.length()-1);
    }
}