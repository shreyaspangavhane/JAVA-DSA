import java.util.HashSet;
import java.util.Iterator;
public class A1_HashSet {

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //add element
        set.add(1);
        set.add(3);
        set.add(6);
        set.add(1);         //Dubblicate not work in HashSet 
        set.add(2);

        //size
        System.out.println(set.size());

        //Print all element
        System.out.println(set);

        //print using Iteartor
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Search
        if (set.contains(2)) {
            System.out.println("Element Found!!");
        }
        else{
            System.out.println("Element Not Found!!");
        }
    
        //delete
        set.remove(1);
        set.remove(6);
    
    
    }
}