package 数据结构_队列;

public class QueueNode<T> {
    private T element;
    private QueueNode next;
    //构造方法
    public QueueNode(){
        element = null;
        next = null;
    }
    public QueueNode(T Element) {
        element = Element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public QueueNode getNext() {
        return next;
    }
}
