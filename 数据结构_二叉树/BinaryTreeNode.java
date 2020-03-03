package 数据结构_二叉树;

public class BinaryTreeNode<T> {
//    树结点，及左右结点定义
    protected T element;
    protected BinaryTreeNode<T> left,right;
//    结点构造方法
    public BinaryTreeNode(T obj){
        element = obj;
        left = null;
        right = null;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getElement() {
        return element;
    }
}
