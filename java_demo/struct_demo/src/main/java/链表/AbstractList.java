package 链表;

public abstract class AbstractList<E> implements List<E> {
    protected int size;
    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public boolean contains(E var1) {
        return this.indexOf(var1) != -1;
    }

    @Override
    public void add(E var1) {
        this.add(this.size,var1);
    }

    @Override
    public E get(int var1) {
        return null;
    }

    @Override
    public E set(int var1, E var2) {
        return null;
    }

    @Override
    public void add(int var1, E var2) {

    }

    @Override
    public E remove(int var1) {
        return null;
    }

    @Override
    public int indexOf(E var1) {
        return 0;
    }

    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:"+index+",Size"+this.size);
    }

    protected void rangeCheck(int index) {
        if (index<0 || index >= this.size){
            this.outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index){
        if (index<0 || index > this.size){
            this.outOfBounds(index);
        }
    }
}
