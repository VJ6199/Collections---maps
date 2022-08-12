import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args){
        TreeMap<Integer, Character> bc = new TreeMap<> ();
        bc.put(1,'a');
        bc.put(2,'b');
        bc.put(3,'c');
        bc.put(4,'d');
        bc.put(5,'a');
        bc.put(1,'e');
        bc.put(4,'c');
        System.out.println(bc);
        TreeMap < String, Double> bd = new TreeMap<>();
        bd.put("vijay", 2.5);
        bd.put("Abhi", 3.5);
        bd.put("nikhil", 3.5);
        bd.put("akash", 4.5);
        bd.put("akash", 1.5);
        bd.put("tharun", 2.5);
        System.out.println(bd);
    }
}
