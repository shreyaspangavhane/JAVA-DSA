public class Occurance_of_ele_at_position {
    public static void occurance(String str,int idx){
        if(idx==0){
            System.out.println("First element "+str.charAt(idx));
                        
        }
        if(idx==str.length()-1){
            System.out.println("last element "+str.charAt(idx));
            return;
        }
        
 
        occurance(str, idx+1);
    }
    public static void main(String[] args) {
        String str="wfeheqbbvbfb";
        occurance(str, 0);
    }
    
}
