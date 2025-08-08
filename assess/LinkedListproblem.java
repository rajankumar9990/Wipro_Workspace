package com.assess;

import java.util.Scanner;

public class LinkedListproblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        if (numberOfElements > 0) {
            SinglyLinkedList.Node head = new SinglyLinkedList.Node(scanner.nextInt());
            SinglyLinkedList linkedList = new SinglyLinkedList(head);

            for (int i = 1; i < numberOfElements; i++) {
                linkedList.add(new SinglyLinkedList.Node(scanner.nextInt()));
            }

            linkedList.reverse();
            linkedList.print();
        }

        scanner.close();
    }
}

class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;    // store next
            current.next = prev;    // reverse pointer
            prev = current;         // move prev forward
            current = next;         // move current forward
        }

        head = prev; // new head
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" ");
            }
            temp = temp.next;
        }
    }
}