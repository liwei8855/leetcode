package com.example.java_test.链表;

public abstract class AbstractList<E> implements List<E> {
    protected int size;

    public AbstractList() {}

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size==0;
    }

    public boolean contains(E element) {
        return this.indexOf(element) != -1;
    }

    public  void add(E element) {
        this.add(this.size,element);
    }

    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:"+index+", Size:"+this.size);
    }

    protected  void rangeCheck(int index) {
        if (index < 0 || index>= this.size) {
            this.outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index<0 || index>this.size) {
            this.outOfBounds(index);
        }
    }

}
