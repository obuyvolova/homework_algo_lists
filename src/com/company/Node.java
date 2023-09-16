package com.company;

public class Node {
    private Integer value;
    private Node prev;

    public Node(Integer value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public Integer getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }
}
