import java.util.HashSet;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> an = new HashSet<Integer>();
        an.add(3);
        an.add(7);
        an.add(1);
        an.add(9);
        HashSet<Float> ao = new HashSet<Float>();
        ao.add(3.5f);
        ao.add(5.2f);
        ao.add(1.8f);
        ao.add(9.3f);
        HashSet<Double> ap = new HashSet<Double>();
        ap.add(3.5);
        ap.add(5.2);
        ap.add(1.8);
        ap.add(9.3);
        HashSet<String> aq = new HashSet<String>();
        aq.add("Java");
        aq.add("is a");
        aq.add("programming");
        aq.add("language");
        System.out.println(an);
        System.out.println(aq);
        System.out.println(ao);
        System.out.println(ap);
        System.out.println("size of aq: "+aq.size());
        System.out.println("whether object ap is empty: "+ap.isEmpty());
        System.out.println("adding to an: "+an.add(12));
        System.out.println("remove from ao: "+ao.remove(5.2f));
        System.out.println("clone object an: "+an.clone());
        System.out.println("clone object ao: "+ao.clone());
    }
}
