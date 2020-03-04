package 数据结构_二叉搜索树;

import 数据结构_二叉树.BinaryTreeNode;

public class Ordertree {
    /**
     * 前序遍历
     * @param root a root of preorder
     */
    public void preorder(SearchTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            System.out.print(root.getElement()+" ");
            return;
        }
        else{
            System.out.print(root.getElement()+" ");
            if(root.getLeft() != null)
                preorder(root.getLeft());
            if(root.getRight() != null)
                preorder(root.getRight());
        }
    }

    /**
     * 中序遍历
     * @param root root a root of infixorder
     */
    public void infixorder(SearchTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            System.out.print(root.getElement()+" ");
            return;
        }
        else{
            if(root.getLeft() != null)
                infixorder(root.getLeft());
            System.out.print(root.getElement()+" ");
            if(root.getRight() != null)
                infixorder(root.getRight());
        }
    }

    /**
     * 后序遍历
     * @param root root a root of postorder
     */
    public void postorder(SearchTreeNode root){
        if(root.getLeft() == null && root.getRight() == null){
            System.out.print(root.getElement()+" ");
            return;
        }
        else{
            if(root.getLeft() != null)
                postorder(root.getLeft());
            if(root.getRight() != null)
                postorder(root.getRight());
            System.out.print(root.getElement()+" ");
        }
    }
}
