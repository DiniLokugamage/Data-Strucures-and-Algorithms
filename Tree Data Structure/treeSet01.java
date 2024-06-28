import java.util.TreeSet;

public class treeSet01{
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<String>();
        tree1.add("Ravi");
        tree1.add("Vijay");
        tree1.add("Ravi");
        tree1.add("Ajay");
        tree1.add("Rani");
        System.out.println(tree1);
    }
}