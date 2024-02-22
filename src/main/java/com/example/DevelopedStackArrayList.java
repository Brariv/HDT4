package com.example;

import java.util.ArrayList;

public class DevelopedStackArrayList implements UVGStackV {
    private ArrayList<Object> stack = new ArrayList<>();

    @Override
    public void push(Object item) {
        stack.add(item);
    }

    @Override
    public Object pop(int index) {
        if (isEmpty()) {
            return null;
        } else if (stack.size() == 1) {
            stack.remove(0);
            return null;
        }
        stack.remove(index);
        return top();
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Object getIndex(int index) {
        if (isEmpty()) {
            return null;
        }
        return stack.get(index);
    }

    public int size() {
        return stack.size();
    }

    public Object replace(int index, Object item) {
        if (isEmpty()) {
            return null;
        }
        stack.set(index, item);
        return stack.get(index);
    }
}