package 经典算法;
import java.util.*;
public class 构造哈夫曼编码问题 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 6;
		List<HuffNode> list = new LinkedList<HuffNode>();
		//初始化2n-1个空节点
		for(int i = 0; i < 2 * n-1;i++) {
			HuffNode temp = new HuffNode(0, -1, -1, -1);
			list.add(temp);
		}
		//给这n个节点赋权值
		for(int i = 0;i < n;i++) {
			list.get(i).value = i;
			list.get(i).weight = in.nextDouble();
		}
		//构造哈夫曼树
		for(int i  = 0;i < n-1;i++) {
			double m1 = Double.MAX_VALUE;
			double m2 = Double.MAX_VALUE;
			int x1 = -1;int x2 = -1;
			for(int j = 0;j < n+i;j++) {
				if(list.get(j).weight < m1 && list.get(j).parent == -1) {
					m2 = m1;
					x2 = x1;
					m1 = list.get(j).weight;
					x1 = j;
				}else if(list.get(j).weight < m2 && list.get(j).parent == -1){
					m2 = list.get(j).weight;
					x2 = j;
				}
			}
			list.get(x1).parent = n+1;
			list.get(x2).parent = n+1;
			list.get(n+i).weight = m1+m2;
			list.get(n+i).lchild = x1;
			list.get(n+i).rchild = x2;
			for(HuffNode temp:list)
				System.out.print(temp.weight+" ");
			System.out.println();
		}
	}
}
class HuffNode{
	double weight;
	int parent;
	int lchild;
	int rchild;
	int value;
	public HuffNode(double weight, int parent, int lchild, int rchild) {
		this.weight = weight;
		this.parent = parent;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
}
