package 数据结构_队列;

public interface QueueADT<T> {
    //入队操作
    public void enqueue(T element);
    //出队操作
    public T dequeue();
    //查看对头元素
    public T first();
    //判断队列是否为空
    public boolean isEmpty();
    //队列长度查看
    public int size();
}
