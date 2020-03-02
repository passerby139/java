package 数据结构_队列;

public class 实现LinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println("========================================================");

        CircularArrayQueue<Integer> queue1 = new CircularArrayQueue<Integer>();

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);

        System.out.println(queue1.dequeue());
        System.out.println(queue1.first());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
    }
}
