package 数据结构_二叉搜索树;

public class TEST {
    public static void main(String[] args) {
        SearchLinkedTree root = new SearchLinkedTree();
        SearchTreeNode node = new SearchTreeNode(3);
        
        root.addElement(5,node);
        root.addElement(2,node);
        root.addElement(7,node);
        root.addElement(1,node);
        root.addElement(4,node);

        root.order(node);
        root.removeElement(5,node);
        if(root.flag == 1){
            System.out.println("\n\n(Deleted successfully!!!)");
            root.order(node);
        }
        else
            System.out.println("\n\n(Sorry,not find this element!!!)");

    }
}
