package com.example.java_test.链表;

public class CircleLinkedList<E> extends AbstractList<E> {//双向循环链表
    private Node first;
    private Node last;
    private Node current;

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;
        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(this.element).append("]");
            return sb.toString();
        }
    }

    public void reset() {
        current = first;
    }

    public void next() {
//        if (size == 0) {
//            current = null;
//        } else {
//            current = current.next;
//        }
        if (current != null) {
            current = current.next;
        }
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public int indexOf(E var1) {
        if (var1 == null) {
            Node node = first;
            for (int i=0;i<size;i++) {
                if (node.element == null) {
                    return i;
                }
                node = node.next;
            }
        } else  {
            Node node = first;
            for (int i=0;i<size;i++) {
                if (var1.equals(node.element)) {
                    return i;
                }
                node = node.next;
            }
        }
//        int index = 0;
//        Node node = first;
//        while (node != null) {
//            if (node.element == var1) {
//                return index;
//            }
//            index++;
//            node = node.next;
//        }
        return ELEMENT_NOT_FOUND;
    }

    public E remove() {
        if (current == null) {
            return null;
        } else {
            Node<E> next = current.next;
            Node<E> node = current;
//            System.out.println(current.element);
            remove(current);
            if (this.size==0) {
                current = null;
            } else {
                current = next;
            }
            return node.element;
        }
    }

    @Override
    public E set(int var1, E var2) {
        Node<E> node = node(var1);
        E element = node.element;
        node.element = var2;
        return element;
    }

    public void add(E element){
//        System.out.println("e:"+element+"size:"+size);
        add(size,element);
    }

    @Override
    public void add(int var1, E var2) {
        rangeCheckForAdd(var1);
//
//        if (first == null) {//插入第一个节点
//            Node newNode = new Node(null,var1,null);
//            newNode.element = var1;
//            first = newNode;
//            last = newNode;
//            newNode.next = newNode;
//            newNode.prev = newNode;
//
//        }

        if (var1 == this.size) {//插入第一个节点也满足index==size
            Node newNode = new Node(last,var2,first);
            if (first == null) {
                first = newNode;
                newNode.prev = newNode;
                newNode.next = newNode;
            } else {
                last.next = newNode;
                first.prev = newNode;
            }
            last = newNode;

        } else  {
//                Node oldNode = node(var1);
//                Node newNode = new Node(oldNode.prev,var2,oldNode);
//                newNode.prev.next = newNode;
//                newNode.next = oldNode;
            Node next = node(var1);
            Node prev = next.prev;
            Node node = new Node(prev,var2,next);
            prev.next = node;
            next.prev = node;

            if (next == first) {
                first = node;
            }
        }
        this.size++;
    }

    @Override
    public E remove(int var1) {
        rangeCheck(var1);
        return remove(node(var1));
    }

    private E remove(Node<E> node) {

        if (this.size == 1) {
            first = null;
            last = null;
        } else {

            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;

            if (node == first) {
                first = next;
            }
            if (node == last) {
                last = prev;
            }

        }
        this.size--;
        return node.element;
    }

    @Override
    public E get(int var1) {
        return node(var1).element;
    }

    private Node<E> node(int index){
        rangeCheck(index);

//        Node n = first;
//        while (index>0 && n != null){
//            index--;
//            n = n.next;
//        }
//        return n;
        if (index < (size>>1)) {
            Node node = first;
            for(int i=0;i<index;i++) {
                node = node.next;
            }
            return node;
        } else {
            Node node = last;
            for(int i= size-1;i>index;i--) {
                node = node.prev;
            }
            return node;
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        CircleLinkedList.Node node = this.first;
        for(int i=0;i<this.size;i++) {
//            if (i != 0) {
//                string.append(", ");
//            }
            string.append(node);
            node = node.next;
        }

        return string.toString();
    }
}
