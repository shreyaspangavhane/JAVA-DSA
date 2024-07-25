import java.util.HashSet;

public class Unique_subsequence {
    public static void Subsequence(String str,int idx,String newstr,HashSet<String>set){
        if (idx==str.length()) {
            if (set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;        
                
            }
        }
        char currChar=str.charAt(idx);
        //to be
        Subsequence(str, idx+1, newstr+currChar,set);
        
        //to not be
        Subsequence(str, idx+1, newstr,set);

    }
    

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String>set=new HashSet<>();        
        Subsequence(str, 0, "",set);
    }
}
