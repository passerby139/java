package 数据结构_二叉搜索树;

import 数据结构_二叉树.TraversalTree;

public class SearchLinkedTree {
    public SearchLinkedTree() {
    }

    public void addElement(int element,SearchTreeNode node) {
        if (node == null)
            node.setElement(element);
        while (node != null) {
            if (element < node.getElement()) {
                if (node.getLeft() == null) {
                    node.setLeft(new SearchTreeNode(element));
                    System.out.println(element+"插到了"+node.getElement()+"左边");
                    break;
                }
                node = node.getLeft();
            } else {
                if (node.getRight() == null) {
                    node.setRight(new SearchTreeNode(element));
                    System.out.println(element+"插到了"+node.getElement()+"右边");
                    break;
                }
                node = node.getRight();
            }
        }
    }
    int flag = 0;
    public void removeElement(int element,SearchTreeNode root){
        if(root.getElement() == element){
            root.setElement(root.getRight().getElement());
            root.setRight(null);
            flag = 1;
        }
        if(root.getLeft() == null && root.getRight() == null){
            return;
        }
        else{
            if(root.getLeft() != null)
                removeElement(element,root.getLeft());
            if(root.getRight() != null)
                removeElement(element,root.getRight());
        }
    }

    public void order(SearchTreeNode root){
        Ordertree tra = new Ordertree();
        System.out.print("\n前序：");
        tra.preorder(root);
        System.out.print("\n中序：");
        tra.infixorder(root);
        System.out.print("\n后序：");
        tra.postorder(root);
    }
}
