package surya.dsa.datastructures.linkedlist;

import java.util.LinkedList;

public class LLBasicOperations {

    public static void main(String[] args) {
        LL<String> llBasicOperations = new LL<String>();

        llBasicOperations.add("int");
        llBasicOperations.add("long");
        llBasicOperations.add("byte");
        llBasicOperations.add("float");


        if (!llBasicOperations.isEmpty()) llBasicOperations.printLinkedList();

        llBasicOperations.printReverseLinkedListRecursive();

        //  llBasicOperations.isEmpty() --> false   !false === true


//        LL<String> llBasicOperations1 = new LL<String>();
//
//        llBasicOperations1.add("Class");
//        llBasicOperations1.printLinkedList();


    }
}

class LL<E> {
    Node<E> prev;
    Node<E> next;

    Node<E> head;
    public final int size = 0;

    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }


    public void printLinkedList() {
        Node<E> temp = head;
        if (head == null) {
            System.out.println("This LinkedList is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.item + "  ");
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    public void printReverseLinkedListRecursive() {
        printRecursive(head);
    }

    private void printRecursive(Node<E> revNode) {
        if (revNode == null) return;
        printRecursive((revNode.next));
        System.out.println(revNode.item);

    }

    public int size() {
        return size;
    }

    public void add(E e) {
        Node<E> l = prev;
        Node<E> newNode = new Node<>(l, e, null);
        prev = newNode;
        if (l == null) {
            head = newNode;
        } else {
            l.next = newNode;
        }

    }

    public void addFirst(E e) {
        Node<E> h = head;
        Node<E> newNode = new Node<>(e, null);
        if (head == null) {
            head = newNode;
            return;
        }
        head = newNode;
        newNode.next = h;
//        head.next = h;
        return;
    }
}

class Node<E> {
    E item;

    Node<E> next;
    Node<E> prev;

    public Node(Node<E> prev, E item, Node<E> next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }
}
