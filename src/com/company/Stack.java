package com.company;

public class Stack {
    public static Node head;
    public Node node;

    public void push(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            node = new Node(value, head);
            head = node;
        }
    }

    public Integer pop() {
        if (head == null) {
            System.out.println("No elements!");
            return null;
        } else {
            int value = head.getValue();
            head = head.getPrev();
            return value;
        }
    }

    public void printMyStack() {
        if (head == null) {
            System.out.println("EMPTY");
        } else {
            node = head;
            while (!(node == null)) {
                System.out.print(node.getValue());
                if (!(node.getPrev() == null)) {
                    System.out.print(" -> ");
                }
                node = node.getPrev();
            }
        }
        System.out.println();
    }

    public void reverse() {
        Node reverseNode = new Node(head.getValue(), null);
        System.out.println(head.getValue());
        head = head.getPrev();
        head = reverseNodeMethod(reverseNode);

    }

    private Node reverseNodeMethod(Node reverseNode) {

        if (head == null) {
            System.out.println("End");
            return reverseNode;
        }
        reverseNode = new Node(head.getValue(), reverseNode);
        System.out.println(head.getValue());
        head = head.getPrev();

        reverseNode = reverseNodeMethod(reverseNode);
        return reverseNode;

//        reverseNode = new Node(head.getValue(), reverseNode);
//        System.out.println(head.getValue());
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseNode);
//        System.out.println(head.getValue());
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseNode);
//        System.out.println(head.getValue());
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseNode);
//        System.out.println(head.getValue());
//        head = head.getPrev();
//
//        head = reverseNode;
    }
}

//
//    Node reverseNode = new Node(head.getValue(), null);
//        System.out.println(head.getValue());
//        Node reverseHead = reverseNode;
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseHead);
//        System.out.println(head.getValue());
//        reverseHead = reverseNode;
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseHead);
//        System.out.println(head.getValue());
//        reverseHead = reverseNode;
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseHead);
//        System.out.println(head.getValue());
//        reverseHead = reverseNode;
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseHead);
//        System.out.println(head.getValue());
//        reverseHead = reverseNode;
//        head = head.getPrev();
//
//        reverseNode = new Node(head.getValue(), reverseHead);
//        System.out.println(head.getValue());
//        reverseHead = reverseNode;
//        head = head.getPrev();
//
//        node = reverseNode;
//        head = reverseHead;
//
//    }
//
//    }
