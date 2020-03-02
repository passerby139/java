package 数据结构_队列;

import javax.naming.ldap.PagedResultsControl;

public class CircularArrayQueue<T> implements QueueADT<T> {
    private final int DEFINE_CAPACITY = 100;
    private int front,rear,count;
    private T[] queue;

    public CircularArrayQueue(int CAPACITY) {
        front = rear = count = 0;
        queue = (T[])(new Object[CAPACITY]);
    }

    public CircularArrayQueue() {
        front = rear = count = 0;
        queue = (T[])(new Object[DEFINE_CAPACITY]);
    }

    @Override
    public void enqueue(T element) {
        if(size() == queue.length)
            expandCapacity();
        queue[rear] = element;
        rear = (rear+1) % queue.length;
        count++;
    }
    public void expandCapacity(){
        T[] larger = (T[])(new Object[queue.length * 2]);
        for (int scan = 0;scan < count;scan++){
            larger[scan] = queue[front];
            front = (front +1 ) % queue.length;
        }
        front = 0;
        rear = count;
        queue = larger;
    }
    @Override
    public T dequeue() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("queue");
        T temp = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return temp;
    }

    @Override
    public T first() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("queue");
        T temp = queue[front];
        return temp;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    @Override
    public int size() {
        return count;
    }
}
class EmpatycollectionException extends RuntimeException{
    public EmpatycollectionException(String str) {
        super("This " + str + " is empty!");
    }
}