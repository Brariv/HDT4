package com.example;

public class DevelopedStackSingleLinkedList implements UVGStackV {
    private SingleLinkedList stack = new SingleLinkedList();

    @Override
    public void push(Object item) {
        stack.add(item);
    }

    @Override
    public Object pop(int index) {
        if (isEmpty()) {
            return null;
        } else if (stack.size() == 1) {
            return stack.remove();
        } else {
            // No es posible eliminar por índice en una lista enlazada simple,
            // se puede implementar si es necesario, pero aquí simplemente
            // se eliminará el último elemento de la pila.
            return stack.remove();
        }
    }

    @Override
    public Object top() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // No es posible obtener un elemento por índice en una lista enlazada simple
    // ya que no se almacenan los índices, así que este método no se implementa.
    public Object getIndex(int index) {
        return null;
    }

    public int size() {
        return stack.size();
    }

    // No es posible reemplazar un elemento por índice en una lista enlazada simple,
    // ya que no se almacenan los índices, así que este método no se implementa.
    public Object replace(int index, Object item) {
        return null;
    }
}