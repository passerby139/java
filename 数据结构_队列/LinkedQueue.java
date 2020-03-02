package 数据结构_队列;

public class LinkedQueue<T> implements QueueADT<T>{
    private int count;
    private QueueNode<T> head;
    private QueueNode<T> tail;

    public LinkedQueue() {
        count = 0;
        head = tail = null;
    }

    @Override
    public void enqueue(T element) {
        QueueNode<T> node = new QueueNode<T>(element);
        if (isEmpty())
            head = node;
        else
            tail.setNext(node);
        tail = node;
        count++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T temp = head.getElement();
        head = head.getNext();
        count--;
        return temp;
    }

    @Override
    public T first() {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T temp = head.getElement();
        return temp;
    }

    @Override
    public boolean isEmpty() {
        if(count == 0)
            return true;
        else
            return false;
    }

    @Override
    public int size() {
        return count;
    }
}

class EmptyCollectionException extends RuntimeException{
    public EmptyCollectionException(String str) {
        super("This "+str+" is empty!");
    }
}