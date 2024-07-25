//Implementation algo.

//steps:
    //1.check ele is present or not if yes then then update the value by one and key is remains same
    
    //2.key is not already present then update value as 1 i.e 1st time count present

    //3.traversing the element in the map check is times >n/3 i.e condition given print the keys which statisfy that condition


import java.util.*;

public class Q1_Majority_oF_Ele {
    
    public static void Majority(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();   //create hashmap

        int n=nums.length;
        for (int i = 0; i < n; i++) {

            //step 1
            if (map.containsKey(nums[i])) {     //check ele is present or not if yes then
                
                map.put(nums[i],map.get(nums[i])+1);    //then update the value by one and key is remains same
            }
            else{    
                //step 2
                //key is not present then  
                map.put(nums[i], 1);        //update value as 1 i.e 1st time     
            }
        }

            //step 3
        for (int key: map.keySet()) {       //traversing the element in the map
            if (map.get(key)>n/3) {         //check is times >n/3 i.e condition given
                System.out.println(key);    //print the keys which statisfy that condition
            }
        }

    }
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};     //1
        Q1_Majority_oF_Ele obj =new Q1_Majority_oF_Ele();
        obj.Majority(nums);

        
    }
}