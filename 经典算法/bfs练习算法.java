package �����㷨;

import java.util.*;
public class bfs��ϰ�㷨 {
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();//�����ͼ���
		m = in.nextInt();//�����ͼ���
		int[][] map = new int[n][m];//�洢��ͼ
		int[][] flag = new int[n][m];//�洢�������
		boolean end = false;
		
		//�����ͼ
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				map[i][j] = in.nextInt();
			}
		}
		
		//�����������жϱ�����˳��
		Queue<testNode> queue = new LinkedList();
		//������һ���ڵ�
		testNode first = new testNode(0,0);
		queue.add(first);
		//��������
		int[] dirx = {1,0,-1,0}; 
		int[] diry = {0,1,0,-1}; 
		//��ʼѭ����������
		while(!queue.isEmpty()) {
			testNode temp = queue.poll();
			//����һ��������ĸ������жϳ���
			for(int i = 0;i < 4;i++) {
				int nx = temp.x+dirx[i];
				int ny = temp.y+diry[i];
				//����ҵ����ڣ����л��ݲ���ӡ
				if(nx == n-1 && ny == m-1) {
					flag[nx][ny] = flag[temp.x][temp.y]+1;
					huisu(flag);
					end = true;
					break;
				}
				//�ж��Ƿ������÷����ƶ�
				if(check(nx,ny,flag,map)) {
					flag[nx][ny] = flag[temp.x][temp.y]+1;
					testNode node = new testNode(nx,ny);
					queue.add(node);
				}
			}
			if(end) {
				break;
			}
		}
	}
	//�����жϸõ��Ƿ���������
	public static boolean check(int x,int y,int[][] flag,int[][] map) {
		if(0 <= x && x < n && 0 <= y && y < m) {
			if(flag[x][y] == 0 && map[x][y] != 1) {
				return true;
			}
		}
		return false;
		
	}
	//�������ݲ���
	public static void huisu(int[][] flag) {
		//�����ͼ
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				System.out.print(flag[i][j]+" ");
			}
			System.out.println();
		}
		//��ʼ����
			//����ջ�ռ�洢����
			Stack<Map<Integer,Integer>> stack = new Stack();
			//�������
			int temp = flag[n-1][m-1]-1;
			for(int i = n-1,j = m-1;;) {
					if(temp == 0) {
						Map<Integer,Integer> node = new HashMap();
						node.put(0,0);
						stack.push(node);
						break;
					}
					if(j >= 0 && flag[i][j-1] == temp) {
						Map<Integer,Integer> node = new HashMap();
						node.put(i,j-1);
						stack.push(node);
						temp--;
						j--;
						continue;
					}
					if(i >= 0 && flag[i-1][j] == temp) {
						Map<Integer,Integer> node = new HashMap();
						node.put(i-1,j);
						stack.push(node);
						temp--;
						i--;
						continue;
					}
			}
			//����ջ�ռ�
			while(!stack.isEmpty()) {
				Map<Integer,Integer> map = stack.pop();
				System.out.println(map);
			}
	}
}
class testNode{
	int x;
	int y;
	public testNode(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
