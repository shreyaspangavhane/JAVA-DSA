/** Q. find the Union of 2 set
            set A1={7,3,9}
            Set A2={6,3,9,2,9,4}       and the display that intersection ele and ele count

 */ 
import java.util.HashSet;

public class Q2_Union_Of_2_Set {

    public static int Union_HahSet(int A1[],int A2[]){
        HashSet<Integer>set=new HashSet<>();        //create hashset
        
        for (int i = 0; i < A1.length; i++) {       //1st loop for add A1 ele into Hashset set
            set.add(A1[i]);             //adding ele into the set
        }

        for (int j = 0; j < A2.length; j++) {       //2st loop for add A2 ele into Hashset set
            set.add(A2[j]);        
        }        
        System.out.println(set.size());             //print size of set
        System.out.println(set);            //print the union ele i.e set ele
        return 0;
    }
    public static void main(String[] args) {
        int A1[]={7,3,9};
        int A2[]={6,3,9,2,9,4};
        Q2_Union_Of_2_Set obj=new Q2_Union_Of_2_Set();
        obj.Union_HahSet(A1, A2);
    }
}