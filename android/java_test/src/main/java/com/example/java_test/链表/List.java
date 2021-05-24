package com.example.java_test.链表;

public interface List<E> {
    int ELEMENT_NOT_FOUND = -1;
    void clear();
    int size();
    boolean isEmpty();
    boolean contains(E var1);
    void add(E var1);
    E get(int var1);
    E set(int var1, E var2);
    void add(int var1, E var2);
    E remove(int var1);
    int indexOf(E var1);
}
