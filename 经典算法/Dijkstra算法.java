package �����㷨;

import java.util.*;

public class Dijkstra�㷨 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//����һ���ж��ٸ��ص�
		int n = in.nextInt();
		//����һ���ж�����·���ص�
		int m = in.nextInt();
		//��ʼ��
		char[][] map = new char[n][n];
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				map[i][j] = '*';
		for(int i = 0;i < m;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			map[a][b] = (char)c;
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print((int)map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("****************************");
		List<Integer> s = new LinkedList<Integer>();
		s.add(1);
		char[] dist = map[0];
		int[] p = new int[n];
		while(s.size() != 5) {
			//����С
			char temp = dist[0];
			int flag = 0;
			for(int i = 0;i < n;i++) {
				if(dist[i] != '*' && dist[i] < temp) {
					if(p[i] == 0) {
						temp = dist[i];
						flag = i;
					}
				}
			}
			System.out.println("��С"+(int)temp);
			//����sս��
			s.add((int)temp);
			p[flag] = 1;
			//�趫��
			for(int i = 0;i < n;i++) {
				char t = map[flag][i];
				if(t != '*') {
					if(t+dist[flag] < dist[i])
						dist[i] = (char) (t+dist[flag]);
				}
			}
		}
		for(int temp:dist) {
			System.out.print(temp+" ");
		}
	}
}
/**
 5 8
 0 1 2
 0 2 5
 1 2 2
 1 3 6
 2 3 7
 2 4 1
 3 2 2
 3 4 4
 * */
