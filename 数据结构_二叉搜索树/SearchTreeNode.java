package 数据结构_二叉搜索树;

public class SearchTreeNode {
    private int element;
    private SearchTreeNode left,right;

    public SearchTreeNode(int element) {
        this.element = element;
        left = null;
        right = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public SearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(SearchTreeNode left) {
        this.left = left;
    }

    public SearchTreeNode getRight() {
        return right;
    }

    public void setRight(SearchTreeNode right) {
        this.right = right;
    }
}
