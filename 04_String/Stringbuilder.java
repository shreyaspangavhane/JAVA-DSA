public class Stringbuilder {
    public static void main(String[] args) {
        //decleartion of string builder
        StringBuilder sb=new StringBuilder("Thalapathy");
        System.out.println("string will be: ");
        System.out.println(sb);
        System.out.println();
        for (int i = 0; i <sb.length(); i++) {   //peint ele indexwise
            System.out.println(i+" = "+sb.charAt(i));
        }
        //string builder using charAt()
        System.out.println("print element at Index: ");
        System.out.println(sb.charAt(0));  // element at 0th position
        System.out.println(sb.charAt(5)); //element at 5th position is whitespace
        System.out.println();

        //Set char at index    set 2nd index e
        System.out.println("After the set element: ");
        sb.setCharAt(2, 'e');
        System.out.println(sb);
        sb.setCharAt(2, 'a');
        System.out.println(sb);

        // Insert element 
        System.out.println("Insertion of Element");
        //insert n at 2nd position
        sb.insert(0,'V');
        System.out.println(sb);
   
        //delete Element   
        sb.delete(6, 11); 
        System.out.println(sb);
   
        //Append ==>> add element at last
        StringBuilder s=new StringBuilder("Ya");
        System.out.println("Append string operation");
        s.append('s');    //add s at last of Ya
        System.out.println(s);
        s.append('h');    //add element h at last Yas
        System.out.println(s);
   
    }
}
