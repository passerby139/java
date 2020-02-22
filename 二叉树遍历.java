package ���ݽṹ;

public class ���������� {
	public static void main(String[] args) {
		selectTree tree = new selectTree();
		
		TreeNode root = new TreeNode(1,"����");
		tree.setRoot(root);
		TreeNode root1 = new TreeNode(2,"�ŷ�");
		TreeNode root2 = new TreeNode(3,"����");
		TreeNode root3 = new TreeNode(4,"�ܲ�");
		TreeNode root4 = new TreeNode(5,"��Ȩ");
		TreeNode root5 = new TreeNode(6,"Ԭ��");
		
		root.setLeft(root1);
		root.setRight(root2);
		root2.setLeft(root3);
		root2.setRight(root4);
		root4.setLeft(root5);

		System.out.println("ǰ�����");
		tree.preOrder();
		System.out.println("�������");
		tree.infixOrder();
		System.out.println("�������");
		tree.postOrder();
	}
}

class selectTree{
	private TreeNode root;
	
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	//ǰ�����
	public void preOrder() {
		if(this.root != null) {
			root.preOrder();
		}
		else {
			System.out.println("����Ϊ������");
		}
	}
	//�������
	public void infixOrder() {
		if(this.root != null) {
			root.infixeprOrder();
		}
		else {
			System.out.println("����Ϊ������");
		}
	}
	//�������
	public void postOrder() {
		if(this.root != null) {
			root.postOrder();
		}
		else {
			System.out.println("����Ϊ������");
		}
	}
}


class TreeNode{
	private int id;
	private String name;
	private TreeNode left;
	private TreeNode right;
	//���ɹ��췽��
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


	//ǰ�к����ֱ���


	//ǰ�����
	public void preOrder() {
		System.out.println(this);
		if(this.left != null) {
			this.left.preOrder();
		}
		if(this.right != null){
			this.right.preOrder();
		}
	}
	//��������
	public void infixeprOrder() {
		if(this.left != null) {
			this.left.infixeprOrder();
		}
		System.out.println(this);
		if(this.right != null){
			this.right.infixeprOrder();
		}
	}
	//�������
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