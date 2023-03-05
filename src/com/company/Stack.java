package com.company;

public class Stack {
    public Node head;
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
            int value = head.value;
            head = head.prev;
            return value;
        }
    }

    public void printMyStack() {
        if (head == null) {
            System.out.println("EMPTY");
        } else {
            node = head;
            while (!(node == null)) {
                System.out.print(node.value);
                if (!(node.prev == null)) {
                    System.out.print(" -> ");
                }
                node = node.prev;
            }
        }
        System.out.println();
    }

    public Stack reverse() {
        if (head == null) {
            return null;
        }
        reversedHead(node);
        Stack reversedStack = new Stack();
        Snake snakeNode = reversedHead(node);

    }

    public Snake reversedHead(Node node) {
        Snake snake = new Snake(null, null);
        Node newNode = new Node(node.value, null);
        if (node.prev == null) {
            return new Snake(node.value, node.value);;
        } else {
            snake = reversedHead(node.prev);
            Snake newSnake = new Snake(head.value, snake.tail);
        }
        return null;
    }

}
