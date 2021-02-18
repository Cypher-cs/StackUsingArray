/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 18-02-2021
 *   Time: 9:12 PM
 *   File: MyStack.java
 */

package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    // maximum number of elements in stack
    private final int MAX_CAPACITY;
    // array to store elements of stack
    int[] array;
    int top;

    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        array = new int[MAX_CAPACITY];

        top = 0;
    }

    @Override
    public void push(int element) {
        if (top != MAX_CAPACITY) {
            array[top] = element;
            top++;
        } else {
            System.out.println("Stack OverFlow");
        }
    }

    @Override
    public int pop() {
        int response = 0;
        if (!isEmpty()) {
            top--;
            response = array[top];
        } else {
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()) {
            response = array[top - 1];
        }
        else {
            System.out.println("Stack is Empty");
    }
        return response;
}

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int Size() {
        return top;
    }
}
