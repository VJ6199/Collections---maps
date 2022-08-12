import java.util.Vector;

public class Ector {
    public static void main(String[] args){
        Vector<Integer> aj = new Vector<Integer>();
        aj.add(3);
        aj.add(7);
        aj.add(1);
        aj.add(9);
        Vector<Float> ak = new Vector<Float>();
        ak.add(3.5f);
        ak.add(5.2f);
        ak.add(1.8f);
        ak.add(9.3f);
        Vector<Double> al = new Vector<Double>();
        al.add(3.5);
        al.add(5.2);
        al.add(1.8);
        al.add(9.3);
        Vector<String> am = new Vector<String>();
        am.add("Java");
        am.add("is a");
        am.add("programming");
        am.add("language");
        System.out.println(aj);
        System.out.println(ak);
        System.out.println(al);
        System.out.println(am);
    }
}
