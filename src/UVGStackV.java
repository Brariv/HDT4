interface  UVGStackV <E>{
    public void push(E item);
    public E pop(int index);
    public E top();
    public boolean isEmpty();
    public E getIndex(int index);
    public int size();
    public E replace(int index, E item);
}
