/** Q. find the intersection of 2 set
            set A1={7,3,9}
            Set A2={6,3,9,2,9,4}       and the display that intersection ele and ele count

 */ 
import java.util.HashSet;

public class Q3_Intersection_of_Ele_in_Set {

    public static int Intersection_HahSet(int A1[],int A2[]){
        HashSet<Integer>set=new HashSet<>();        //main hashset
        HashSet<Integer>set2=new HashSet<>();       //for intersection ele set

        int count=0;                            //count the number of intersection
        for (int i = 0; i < A1.length; i++) {
            set.add(A1[i]);         //add ele in the set
        }
        
        for (int j = 0; j < A2.length; j++) {
            if (set.contains(A2[j])) {              //check condition is set conatin the ele of the A2 Array
                count++;                    //count the ele 
                set2.add(A2[j]);            //is present then add it into set 2
                set.remove(A2[j]);          //remove that ele
            }        
        }        
        System.out.println(count);      
        System.out.println(set2);
        return 0;
    }
    public static void main(String[] args) {
        int A1[]={7,3,9};
        int A2[]={6,3,9,2,9,4};
        Q3_Intersection_of_Ele_in_Set obj=new Q3_Intersection_of_Ele_in_Set();
        obj.Intersection_HahSet(A1, A2);
    }
}