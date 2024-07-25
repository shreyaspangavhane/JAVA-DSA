import java.util.*;
public class A1_HashMap {

    public static void main(String[] args) {
        //country and population data 
        HashMap<String,Integer> hmap=new HashMap<>();
    
        //Insertion
        hmap.put("Bharat", 120);
        hmap.put("USA", 50);
        hmap.put("China", 119);

        System.out.println(hmap);
    
        //Updation the value of key
        hmap.put("USA", 80);
        
        //print all element
        System.out.println(hmap);

        

        //Search key
        if (hmap.containsKey("China")) {
            System.out.println("Key is Found");
        }
        else{
            System.out.println("Key is Not Found");
        }

        //find value of the key
        System.out.println(hmap.get("Bharat"));     //key is exist
        System.out.println(hmap.get("Iran"));     //key is Not Exist-->print Null value

        //print by using Iterator
   //     for(hmap.Entry<String ,Integer> it : hmap.entrySet()){
     //       System.out.println(it.getkey());
       //     System.out.println(it.getvalue());
      //  }
        
        //print by using set 
        Set <String> keys=hmap.keySet();
        for(String key:keys){
            System.out.println(key+" "+hmap.get(key));
        }

        //delete or remove
        hmap.remove("China");
        System.out.println(hmap);


        
    
    }
}