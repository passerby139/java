package 数据结构_二叉树;

public class LinkedBinaryTree<T> {
    protected BinaryTreeNode<T> root;
    protected int modCount;

    public LinkedBinaryTree(T root) {
        this.root = new BinaryTreeNode<T>(root);
    }

    public BinaryTreeNode<T> getRootNode() {
        return root;
    }

    public void setRootleft(LinkedBinaryTree left){
        root.setLeft(left.getRootNode());
    }

    public void setRootright(LinkedBinaryTree right){
        root.setRight(right.getRootNode());
    }

    public void order(){
        TraversalTree tra = new TraversalTree();
        System.out.print("\n前序：");
        tra.preorder(root);
        System.out.print("\n中序：");
        tra.infixorder(root);
        System.out.print("\n后序：");
        tra.postorder(root);
        System.out.print("\n孩子：");
        System.out.print(tra.children(root));
        System.out.print("\n树的高度："+tra.getTemp(root));
    }
}
