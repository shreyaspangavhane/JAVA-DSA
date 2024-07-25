public class Doublicate_string{
    public static boolean[] map=new boolean[25];

    public static void remove_Dublicate(String str,int idx,String newstr){
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }

        char currChar=str.charAt(idx);  
        if(map[currChar-'a']){
            remove_Dublicate(str, idx+1, newstr);
        }
        else{
            newstr+=currChar;
            map[currChar-'a']=true;
            remove_Dublicate(str, idx+1, newstr);
        }


    }
    public static void main(String[] args) {
       String str="abbccda";
       remove_Dublicate(str, 0, ""); 
    }
}