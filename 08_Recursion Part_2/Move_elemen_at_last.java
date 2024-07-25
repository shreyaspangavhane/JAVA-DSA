public class Move_elemen_at_last {
    public static void moveAllX(String str,int idx,int count,String newStr)
    {
        //here in this code we use 2 function call so it is more IMP for placements

        if(idx==str.length()){
            for (int i = 0; i <count; i++) {   
                newStr+='x';
            }
        }
        char currChar=str.charAt(idx);
        if(currChar == 'x'){     //check currchar is x if yes then count how many x will be there
            count++;
            moveAllX(str, idx+1, count, newStr);    //check all x to move
        }
        else{
            newStr+=currChar;    //add current char remaining other than x assign to new string named as newstr
            moveAllX(str, idx+1, count, newStr);
        }


    }
    public static void main(String[] args) {
        String str="abxdxgxxsd";
        moveAllX(str, 0, 0, "");        // call the function
    }
    
}
