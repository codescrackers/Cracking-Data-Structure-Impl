package com.edsoft.stackqueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yusuf on 05.10.2016.
 */
public class SetOfStacks {
    private static List<MyStack<Integer>> stackList = new ArrayList<>();
    private static int threshold = 0;
    private static int count = 0;


    public static Integer size() {
        return stackList.size();
    }

    public static Integer pop() {
        if (stackList.get(count).isEmpty()) {
            threshold = 2;
            stackList.remove(count);
            count--;
            return stackList.get(count).pop();
        } else {
            threshold--;
            return stackList.get(count).pop();
        }
    }

    public static void push(Integer item) {
        if (threshold == 0) {
            stackList.add(new MyStack<>());
        }
        stackList.get(count).push(item);
        threshold++;
        if (threshold == 3) {
            threshold = 0;
            count++;
        }
    }

    public static Integer popAt(Integer index) {
        //FIX ME
        if (stackList.get(index).isEmpty()) {//Last Element
            return pop();
        } else {
            return stackList.get(index).pop();
        }
    }

    public static MyStack<Integer> sortStack(MyStack<Integer> stack) {
        MyStack<Integer> dummyStack = new MyStack<>();
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            if (stack.peek() < min) {
                min = stack.pop();
                dummyStack.push(min);
            } else {
                dummyStack.pop();
                dummyStack.push(stack.pop());
                dummyStack.push(min);
            }
        }
        return dummyStack;
    }
}

