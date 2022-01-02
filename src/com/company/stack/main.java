package com.company.stack;

import java.util.Arrays;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println("stack.size() = " + stack.size());
        stack.push(56);
        stack.push(897);
        stack.push(876);
        stack.push(543);
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

    }
}
