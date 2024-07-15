package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    private Node head;

    // Add a new node at the front of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add a new node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Search for a node by value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

class LinkedListApplication{
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
}
