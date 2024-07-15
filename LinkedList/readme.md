# LinkedList Implementation in Java

This repository contains a simple implementation of a singly linked list in Java. The linked list supports basic operations such as insertion, deletion, searching, and displaying the elements.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- A text editor or an Integrated Development Environment (IDE)


## LinkedList Operations

- **Add First**: Adds a new node at the beginning of the list.
- **Add Last**: Adds a new node at the end of the list.
- **Delete**: Deletes the first occurrence of a node with the specified value.
- **Search**: Searches for a node with the specified value.
- **Display**: Displays all nodes in the list.

## Example Usage

```java
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addFirst(10);
    list.addLast(20);
    list.addLast(30);
    list.display(); // Output: 10 -> 20 -> 30 -> null

    list.delete(20);
    list.display(); // Output: 10 -> 30 -> null

    System.out.println(list.search(30)); // Output: true
    System.out.println(list.search(40)); // Output: false
}
