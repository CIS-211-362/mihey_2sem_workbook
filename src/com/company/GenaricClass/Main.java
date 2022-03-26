package com.company.GenaricClass;

public class Main {
    public static void main(String[] args) throws Exception {
        StackG<Integer> stack1 = new StackG<Integer>(5);
        stack1.push(10);
        System.out.println(stack1.top());

        StackG<Element> stack2 = new StackG<Element>(5);
        stack2.push(new Element(10, "aaa"));
        System.out.println(stack2.top().key);
        System.out.println(stack2.top().value);
    }
}
