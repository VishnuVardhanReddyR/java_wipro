import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> tree = new TreeSet<>();
        tree.add("ram");
        tree.add("anu");
        tree.add("zeee");
        System.out.println(tree);
        tree.add("zeee");

        System.out.println(tree.descendingSet());
        for(String ele: tree.descendingSet()){
            System.out.println(ele);
        }

        System.out.println("Does set contains zeee : " + tree.contains("zeee"));
    }
}
