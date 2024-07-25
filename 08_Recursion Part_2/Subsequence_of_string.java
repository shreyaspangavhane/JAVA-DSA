public class Subsequence_of_string {
    public static void Subsequence(String str,int idx,String newstr){
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx);
        //to be
        Subsequence(str, idx+1, newstr+currChar);
        
        //to not be
        Subsequence(str, idx+1, newstr);

    }
    

    public static void main(String[] args) {
        String str="abc";
        Subsequence(str, 0, "");
    }
}
