package 数据结构_栈;

public class 实现LinkedStack {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
