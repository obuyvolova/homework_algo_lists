package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Add 0");
        stack.push(0);
        stack.printMyStack();
        System.out.println("Add 1");
        stack.push(1);
        stack.printMyStack();
        System.out.println("Add 2");
        stack.push(2);
        stack.printMyStack();
        System.out.println("Add 3");
        stack.push(3);
        stack.printMyStack();
        System.out.println("Add 4");
        stack.push(4);
        stack.printMyStack();
        System.out.println("Add 5");
        stack.push(5);
        stack.printMyStack();

        System.out.println("Remove from the stack");
        System.out.println(stack.pop());
        stack.printMyStack();
        System.out.println("Remove from the stack");
        System.out.println(stack.pop());
        stack.printMyStack();
        System.out.println("Remove from the stack");
        System.out.println(stack.pop());
        stack.printMyStack();
        System.out.println("Remove from the stack");
        System.out.println(stack.pop());
        stack.printMyStack();
        System.out.println("Remove from the stack");
        System.out.println(stack.pop());
        stack.printMyStack();
        System.out.println("Remove from the stack");
        System.out.println(stack.pop());
        stack.printMyStack();

    }
}
