import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> aw = new TreeSet<Integer>();
        aw.add(3);
        aw.add(7);
        aw.add(1);
        aw.add(9);
        aw.add(5);
        aw.add(2);
        TreeSet<Character> ax = new TreeSet<Character>();
        ax.add('V');
        ax.add('i');
        ax.add('j');
        ax.add('a');
        ax.add('y');
        System.out.println(ax.isEmpty());
        System.out.println(ax);
        System.out.println(aw);
        System.out.println("will ax object contains i"+ax.contains("i"));
        System.out.println("next lowest element than i in object ax: "+ax.lower('i'));
        System.out.println("First letter of object ax:"+ ax.first());
        System.out.println("SubSet :"+ax.subSet('j','a'));
        System.out.println("tailSet :"+ax.tailSet('j'));
        System.out.println("pollFirst :"+ax.pollFirst());
        System.out.println("remove a from ax object "+ax.remove('a'));
    }
}
