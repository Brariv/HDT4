package com.example;
import java.util.Vector;

/**
 * Esta clase representa una implementación de la interfaz UVGStack utilizando un Vector como estructura de datos subyacente.
 * Permite realizar operaciones básicas de una pila, como agregar elementos, quitar elementos, obtener el elemento en la cima y verificar si la pila está vacía.
 */
public class DevelopedStack implements UVGStackV{

    Vector<Object> stack = new Vector<Object>();

    /**
     * Agrega un elemento a la cima de la pila.
     * @param item el elemento a agregar
     */
    @Override
    public void push(Object item) {
        stack.add(item);
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * @return el elemento en la cima de la pila, o null si la pila está vacía
     */
    @Override
    public Object pop(int index) {
        if (isEmpty()){
            return null;
        }else if (stack.size() == 1){
            stack.removeElementAt(0);
            return null;
        }
        stack.removeElementAt(index);
        return top();
    }

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     * @return el elemento en la cima de la pila, o null si la pila está vacía
     */
    @Override
    public Object top() {
        if (isEmpty()){
            return null;
        }

        return stack.elementAt(stack.size() - 1 );
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false de lo contrario
     */
    @Override
    public boolean isEmpty() {
        if (stack.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * Devuelve el indice deseado de la pila.
     * @return el indice deseado de la pila, o null si la pila está vacía
     */
    public Object getIndex(int index){
        if (isEmpty()){
            return null;
        }
        return stack.elementAt(index);
    }

    /**
     * Devuelve el tamaño de la pila.
     * @return el tamaño de la pila
     */
    public int size(){
        return stack.size();
    }

    /**
     * Reemplaza el elemento en el indice deseado de la pila.
     * @return el elemento reemplazado de la pila, o null si la pila está vacía
     */
    public Object replace(int index, Object item){
        if (isEmpty()){
            return null;
        }
        stack.set(index, item);
        return stack.elementAt(index);
    }
}

