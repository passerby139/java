package 经典算法;
import java.util.*;
public class 最小生成树 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] map = new int[n][n];
		for(int i = 0 ;i < n;i++) {
			for(int j = 0;j < n;j++) {
				map[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i = 0;i < m;i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int w = in.nextInt();
			map[u-1][v-1] = map[v-1][u-1] = w;
		}
		
		for(int[] i:map) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("*********************************");
		prim(map,in.nextInt()-1);
	}
	//寻找最小生成树
	public static void prim(int[][] map,int head) {
		List<int[]> list = new LinkedList<int[]>();
		boolean[] flag = new boolean[map[0].length];
		int[] closest = new int[flag.length];
		int[] lowcost = new int[flag.length];
		//完成初始化工作
		flag[head] = true;
		for(int i = 0;i < flag.length;i++) {
			if(i != head) {
				lowcost[i] = map[head][i];
				closest[i] = head;
				flag[i] = false;
			}
		}
		System.out.println();
		for(int i = 0;i < flag.length;i++) {
			int temp = Integer.MAX_VALUE;
			int t = head;
			for(int j = 0;j < flag.length;j++) {
				if((!flag[j]) && (lowcost[j] < temp)) {
					t = j;
					temp = lowcost[j];
				}
			}
			if(t == head)
				break;
			int[] arr = {t,temp};
			list.add(arr);
			flag[t] = true;
			for(int j = 0;j < flag.length;j++) {
				if(!flag[j] && (map[t][j] < lowcost[j])) {
					lowcost[j] = map[t][j];
					closest[j] = t;
				}
			}
		}
		int res = 0;
		System.out.println("遍历的顺序为：");
		System.out.print((head+1)+" ");
		for(int[] temp:list) {
			System.out.print((temp[0]+1)+" ");
			res += temp[1];
		}
		System.out.println("\n总造价为："+res);
	}
	public static void print(int[] closest,int[] lowcost,boolean[] flag) {
		//检验打印结果
		for(boolean i:flag)
			System.out.print(i+" ");
		System.out.println();
		for(int i:closest)
			System.out.print(i+" ");
		System.out.println();
		for(int i:lowcost)
			System.out.print(i+" ");
	}
}
/*
 7 12
1 2 23
1 6 28
1 7 36
2 3 20
2 7 1
3 4 15
3 7 4
4 5 3
4 7 9
5 6 17
5 7 16
6 7 25
1
 */