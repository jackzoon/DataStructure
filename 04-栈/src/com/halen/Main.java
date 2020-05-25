package com.halen;

/**
 * Created By Halen 2020/5/16 17:03
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


    }
}
