package 数据结构;

public class 二叉树遍历 {
	public static void main(String[] args) {
		selectTree tree = new selectTree();
		
		TreeNode root = new TreeNode(1,"刘备");
		tree.setRoot(root);
		TreeNode root1 = new TreeNode(2,"张飞");
		TreeNode root2 = new TreeNode(3,"关羽");
		TreeNode root3 = new TreeNode(4,"曹操");
		TreeNode root4 = new TreeNode(5,"孙权");
		TreeNode root5 = new TreeNode(6,"袁绍");
		
		root.setLeft(root1);
		root.setRight(root2);
		root2.setLeft(root3);
		root2.setRight(root4);
		root4.setLeft(root5);

		System.out.println("前序遍历");
		tree.preOrder();
		System.out.println("中序遍历");
		tree.infixOrder();
		System.out.println("后序遍历");
		tree.postOrder();
	}
}

class selectTree{
	private TreeNode root;
	
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	//前序遍历
	public void preOrder() {
		if(this.root != null) {
			root.preOrder();
		}
		else {
			System.out.println("次树为空树！");
		}
	}
	//中序遍历
	public void infixOrder() {
		if(this.root != null) {
			root.infixeprOrder();
		}
		else {
			System.out.println("此树为空树！");
		}
	}
	//后序遍历
	public void postOrder() {
		if(this.root != null) {
			root.postOrder();
		}
		else {
			System.out.println("此树为空树！");
		}
	}
}


class TreeNode{
	private int id;
	private String name;
	private TreeNode left;
	private TreeNode right;
	//生成构造方法
	public TreeNode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public TreeNode getLeft() {
		return left;
	}



	public void setLeft(TreeNode left) {
		this.left = left;
	}



	public TreeNode getRight() {
		return right;
	}



	public void setRight(TreeNode right) {
		this.right = right;
	}
	



	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", name=" + name + "]";
	}


	//前中后三种遍历


	//前序遍历
	public void preOrder() {
		System.out.println(this);
		if(this.left != null) {
			this.left.preOrder();
		}
		if(this.right != null){
			this.right.preOrder();
		}
	}
	//中续遍历
	public void infixeprOrder() {
		if(this.left != null) {
			this.left.infixeprOrder();
		}
		System.out.println(this);
		if(this.right != null){
			this.right.infixeprOrder();
		}
	}
	//后序遍历
	public void postOrder() {
		if(this.left != null) {
			this.left.postOrder();
		}
		if(this.right != null){
			this.right.postOrder();
		}
		System.out.println(this);
	}
}