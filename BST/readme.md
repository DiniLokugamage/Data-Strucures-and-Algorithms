# Data Structures and Algorithms - Binary Search Tree

This repository contains the implementation of a Binary Search Tree (BST) in Java. The BST is a data structure that allows efficient insertion, deletion, and search operations.

## BSTree Class

The `BSTree` class represents the binary search tree. It has the following methods:

- `insert(int value)`: Inserts a new node with the given value into the BST.
- `traversal(String order)`: Performs a traversal of the BST in the specified order ("Pre", "Post", or "In").
- `search(int value)`: Searches for a node with the given value in the BST.

## BSTNode Class

The `BSTNode` class represents a node in the binary search tree. It has the following properties:

- `value`: The value stored in the node.
- `left`: The left child of the node.
- `right`: The right child of the node.

## Usage

To use the BST, create an instance of the `BSTree` class and call the appropriate methods. Here's an example:

```java
BSTree bst = new BSTree();
bst.insert(20);
bst.insert(10);
bst.insert(30);
bst.insert(5);
bst.insert(15);
bst.insert(40);
bst.traversal("Pre");
System.out.println("Tree is balanced.");

bst.insert(50);
System.out.println("Inserted 50");
bst.traversal("Pre");
System.out.println("Tree is unbalanced to the right - Straight leg detected.");
bst.search(20).right = bst.leftRotate(bst.search(30));
System.out.println("Rotated 30 left");
bst.traversal("Pre");
System.out.println("Tree is balanced");

bst.insert(25);
bst.insert(28);
System.out.println("Inserted 25 and 28");
bst.traversal("Pre");
System.out.println("Tree is unbalanced to the left - Dog leg detected.");
bst.search(30).left = bst.leftRotate(bst.search(25));
System.out.println("Rotated around 25 anticlockwise");
bst.traversal("Pre");
bst.search(40).left = bst.rightRotate(bst.search(30));
bst.traversal("Pre");
System.out.println("Tree is balanced");
```

