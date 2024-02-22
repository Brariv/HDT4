package com.example;

public class SingleLinkedList {
    private Node head;
    private int size; // Agregar un campo para almacenar el tamaño de la lista

    public SingleLinkedList() {
        this.head = null;
        this.size = 0; // Inicializar el tamaño de la lista como 0
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++; // Incrementar el tamaño de la lista después de agregar un elemento
    }

    public Object remove() {
        if (head == null) {
            return null;
        }
        Object removedData = head.data;
        head = head.next;
        size--; // Decrementar el tamaño de la lista después de eliminar un elemento
        return removedData;
    }

    public Object peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size; // Devolver el tamaño almacenado en el campo size
    }
}
