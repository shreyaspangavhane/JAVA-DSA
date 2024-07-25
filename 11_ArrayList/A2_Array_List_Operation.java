import java.util.*;
public class A2_Array_List_Operation{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();     //decleration of integer array list

        //Add Element  from .add - elememt add at last
        list.add(5);
        list.add(2);
        list.add(18);
        System.out.println("List after Add element");
        System.out.println(list);

        //get element--> used to find the at which position which ele is present
        int ele=list.get(2);
        System.out.println("List after get element of 2nd idx");
        System.out.println("Element at 2nd position "+ele);

        //add element at any position    .add(idx,ele)
        list.add(1,23);
        System.out.println("List after Add element at pos 1 to 23");
        System.out.println(list);

        //set element -->> used to set element at given idx
        list.set(0,62);
        System.out.println("List after set element at idx 0 to 62");
        System.out.println(list);

        //delete elememt
        list.remove(3);      //remove the ele present at idx 3
        System.out.println(list);
        
        // size -->>  tell us the size of arraylist
        int size=list.size();
        System.out.println("The size of array list is: "+size);

        // loops
        for (int i = 0; i < list.size(); i++) {
             System.out.println("Element at idx ["+i+"] is "+list.get(i));
        }

        // sorting -->> sort the arrylist element is in asscending order
        Collections.sort(list);
        System.out.println(list);

    }
}