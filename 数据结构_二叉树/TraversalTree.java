package 数据结构_二叉树;

public class TraversalTree {

    private int hi,temp;

    public TraversalTree() {
        hi = 0;
        temp = 0;
    }

    /**
     * 前序遍历
     * @param root a root of preorder
     */
    public void preorder(BinaryTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            System.out.print(root.getElement()+" ");
            return;
        }
        else{
            System.out.print(root.getElement()+" ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    /**
     * 中序遍历
     * @param root root a root of infixorder
     */
    public void infixorder(BinaryTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            System.out.print(root.getElement()+" ");
            return;
        }
        else{
            infixorder(root.getLeft());
            System.out.print(root.getElement()+" ");
            infixorder(root.getRight());
        }
    }

    /**
     * 后序遍历
     * @param root root a root of postorder
     */
    public void postorder(BinaryTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            System.out.print(root.getElement()+" ");
            return;
        }
        else{
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getElement()+" ");
        }
    }

    /**
     * 统计该结点的子孙结点
     * @param root the ancestor of tree
     * @return
     */
    public int children(BinaryTreeNode root){
        int child = 0;
        if(root.getLeft() != null)
            child += 1 + children(root.getLeft());
        if(root.getRight() != null)
            child += 1 + children(root.getRight());
        return child;
    }

    /**
     * 统计该树的高度
     * @param root the ancestor of tree
     * @return
     */
    public int getTemp(BinaryTreeNode root) {
        high(root);
        return temp;
    }
    private void high(BinaryTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            if(hi > temp)
                temp = hi;
            return;
        }
        else{
            hi++;
            high(root.getLeft());
            high(root.getRight());
        }
    }

}
