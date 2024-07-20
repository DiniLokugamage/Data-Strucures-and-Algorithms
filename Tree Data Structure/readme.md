# Tree Data Structure

This repository contains Java code examples for working with the Tree data structure using the TreeSet class from the Java Collections framework.

## Example 1: Integer TreeSet
The `treeSet02` class demonstrates how to create a TreeSet of integers and add elements to it. The elements are automatically sorted in ascending order. The output of this program will be the sorted set of integers.

```java
import java.util.TreeSet;

public class treeSet02 {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<Integer>(); 
        num.add(10);
        num.add(4);
        num.add(1);   
        num.add(5);
        num.add(14);  
        num.add(20);  
        System.out.println(num);   
    }
}
```

## Example 2: String TreeSet
The `treeSet01` class demonstrates how to create a TreeSet of strings and add elements to it. The elements are automatically sorted in lexicographical order. The output of this program will be the sorted set of strings.

```java
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
```

