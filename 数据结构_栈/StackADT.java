package 数据结构_栈;

public interface StackADT<T> {
    public void push(T element);

    public T pop();

    public T peek();

    public boolean isEmpty();

}
