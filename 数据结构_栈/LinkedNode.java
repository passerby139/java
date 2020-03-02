package 数据结构_栈;

public class LinkedNode<T> {
    private T element;
    private LinkedNode<T> next;

    //构造方法
    public LinkedNode() {
        next = null;
        element = null;
    }
    public LinkedNode(T element) {
        this.element = element;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
