import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args){
        LinkedHashMap<Integer, Character> ba = new LinkedHashMap<> ();
        ba.put(1,'a');
        ba.put(2,'b');
        ba.put(3,'c');
        ba.put(4,'d');
        ba.put(5,'a');
        ba.put(1,'e');
        ba.put(4,'c');
        System.out.println(ba);
        LinkedHashMap < String, Double> bb = new LinkedHashMap<>();
        bb.put("vijay", 2.5);
        bb.put("Abhi", 3.5);
        bb.put("nikhil", 3.5);
        bb.put("akash", 4.5);
        bb.put("akash", 1.5);
        bb.put("tharun", 2.5);
        System.out.println(bb);
    }
}
