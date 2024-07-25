import java.util.HashMap;

public class Q4_Itiernary_Of_Tickets {
    public static String GetStart(HashMap<String,String> tick){
        HashMap<String,String>revticket=new HashMap<>();

        for (String key : tick.keySet()) {
            //key->key    val->tick.get(key)
            revticket.put(tick.get(key), key);
        }
        
        for (String key : tick.keySet()) {
            if (!revticket.containsKey(key)) {
                return key;
            }
        }
       return null;
    }
    public static void main(String[] args) {
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start=GetStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.println(start);
            start=tickets.get(start);
        }
    }
}