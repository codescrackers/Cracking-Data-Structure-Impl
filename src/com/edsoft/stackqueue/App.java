package com.edsoft.stackqueue;

/**
 * Created by yusuf on 05.10.2016.
 */
public class App {
    private static Integer MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {

     /*   MyQueueWithStack<Integer> integerMyQueueWithStack = new MyQueueWithStack<>();
        integerMyQueueWithStack.add(6);
        integerMyQueueWithStack.add(2);
        System.out.println(integerMyQueueWithStack.peek());*/
        /*MyStack<Integer> stack = initialize();
        int min = 0;
        while (!stack.isEmpty()) {
            min = findMin(stack.pop());
        }
        System.out.println(min);*/

        MyStack<Integer> stack = initialize();
        stack = SetOfStacks.sortStack(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    private static MyStack<Integer> initialize() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(8);
        stack.push(7);
        return stack;
    }

    private static int findMin(Integer item) {
        MIN = Integer.min(MIN, item);
        return MIN;
    }
}
