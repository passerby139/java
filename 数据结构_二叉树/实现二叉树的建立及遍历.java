package 数据结构_二叉树;

public class 实现二叉树的建立及遍历 {
    public static void main(String[] args) {
        LinkedBinaryTree node1 = new LinkedBinaryTree('a');
        LinkedBinaryTree node2 = new LinkedBinaryTree(6);
        LinkedBinaryTree node3 = new LinkedBinaryTree('c');
        LinkedBinaryTree node4 = new LinkedBinaryTree(4);
        LinkedBinaryTree node5 = new LinkedBinaryTree(5);
        LinkedBinaryTree node6 = new LinkedBinaryTree('-');
        LinkedBinaryTree node7 = new LinkedBinaryTree(7);

        node1.setRootleft(node2);
        node1.setRootright(node3);
        node2.setRootleft(node4);
        node2.setRootright(node5);
        node5.setRootleft(node6);
        node5.setRootright(node7);

        node1.order();
    }
}
