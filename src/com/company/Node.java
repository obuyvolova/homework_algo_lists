package com.company;

public class Node {
    private int value;
    private Node prev;

    public Node (int value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }
}
