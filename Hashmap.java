import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap <Integer, Character> az = new HashMap<> ();
        az.put(1,'a');
        az.put(2,'b');
        az.put(3,'c');
        az.put(4,'d');
        az.put(5,'a');
        az.put(1,'e');
        az.put(2,'c');
        System.out.println(az);
        HashMap < String, Double> aa = new HashMap<>();
        aa.put("vijay", 2.5);
        aa.put("Abhi", 3.5);
        aa.put("nikhil", 3.5);
        aa.put("vijay", 4.5);
        aa.put("akash", 1.5);
        aa.put("tharun", 2.5);
        System.out.println(aa);
    }
}
