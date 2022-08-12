import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> ab = new ArrayList<Integer>();
        ab.add(3);
        ab.add(7);
        ab.add(1);
        ab.add(9);
        ArrayList<Float> ac = new ArrayList<Float>();
        ac.add(3.5f);
        ac.add(5.2f);
        ac.add(1.8f);
        ac.add(9.3f);
        ArrayList<Double> ad = new ArrayList<Double>();
        ad.add(3.5);
        ad.add(5.2);
        ad.add(1.8);
        ad.add(9.3);
        ArrayList<String> ae = new ArrayList<String>();
        ae.add("Java");
        ae.add("is a");
        ae.add("programming");
        ae.add("language");
        System.out.println(ab);
        System.out.println(ac);
        System.out.println(ad);
        System.out.println(ae);
    }
}
