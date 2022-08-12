import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<Integer> ar = new LinkedHashSet<Integer>();
        ar.add(3);
        ar.add(7);
        ar.add(1);
        ar.add(9);
        LinkedHashSet<Float> as = new LinkedHashSet<Float>();
        as.add(3.5f);
        as.add(5.2f);
        as.add(1.8f);
        as.add(9.3f);
        LinkedHashSet<Character> at = new LinkedHashSet<Character>();
        at.add('V');
        at.add('i');
        at.add('j');
        at.add('u');
        LinkedHashSet<String> au = new LinkedHashSet<String>();
        au.add("Java");
        au.add("is a");
        au.add("programming");
        au.add("language");
        System.out.println(ar);
        System.out.println(as);
        System.out.println(at);
        System.out.println(au);
        System.out.println("size of as: "+as.size());
        System.out.println("sum of all in object ar: "+ar.addAll(ar));
        System.out.println("adding to as: "+as.add(2.2f));
        System.out.println("converting object au to Array: "+au.toArray());
        System.out.println("clone object as: "+as.clone());
        System.out.println("changing object ar to 1: "+ar.equals(ar));
    }
}
