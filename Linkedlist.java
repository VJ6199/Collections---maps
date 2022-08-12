import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> af = new LinkedList<Integer>();
        af.add(3);
        af.add(7);
        af.add(1);
        af.add(9);
        LinkedList<Float> ag = new LinkedList<Float>();
        ag.add(3.5f);
        ag.add(5.2f);
        ag.add(1.8f);
        ag.add(9.3f);
        LinkedList<Double> ah = new LinkedList<Double>();
        ah.add(3.5);
        ah.add(5.2);
        ah.add(1.8);
        ah.add(9.3);
        LinkedList<String> ai = new LinkedList<String>();
        ai.add("Java");
        ai.add("is a");
        ai.add("programming");
        ai.add("language");
        System.out.println(af);
        System.out.println(ag);
        System.out.println(ah);
        System.out.println(ai);
    }
}
