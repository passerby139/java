package �����㷨;

/**
 * ��Ϊdfs������ͼ�Թ�������һ��·�ߵ��ڣ�ÿ����һ���Ͱ��շ���ĸ���
 * ˳���ȳ�һ�������ߣ����߲�֮ͨ��ĩ�˾ͻᱻ�϶�Ϊһ�����ڵ㣨����
 * �ĸ������Ѿ�����ס�����ʱ��᷵��false�Ա�ʾ��·��ͨ��Ȼ������
 * ���ڵ�ͻ�ȥ����ȥת����һ��������������ڵ�����ܶ������ڵ㣬��ô
 * ���ڵ�Ҳ�ᱻ�϶�Ϊ���ڵ㣬���εݹ�������ĳһ��̽ͷ�ҵ����յ㣬
 * ��ô���߳����Թ�������
 */

import java.util.*;
public class dfs����ͼ {
	public static void main(String[] args) {
		int[][] map = new int[7][7];
		Scanner in = new Scanner(System.in); 
		
		//�����ͼ
		for(int i = 0;i < 7;i++) {
			for(int j = 0;j < 7;j++) {
				map[i][j] = in.nextInt();
			}
		}
		walking(map,1,1);
		System.out.println("---�ϵ��ӽ��Թ�����·�ߵ���ͼ��---");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
	}

	public static boolean walking(int[][] map,int x,int y) {
		if (map[5][5]==2){
            //map[8][8] Ϊ�յ㣬���յ��߹���ʱ�򣬽�����
            return true;
        }else {
            if (map[x][y]==0){ // ΪO�����ߣ�
                map[x][y] = 2; //�߹�ΪY��
                //�ж����������ĸ������Ƿ�����ߡ�
                if (walking(map,x+1,y)){
                    return true;
                }else if (walking(map,x,y+1)){
                    return true;
                }else if (walking(map,x-1,y)){
                    return true;
                }else if (walking(map,x,y-1)){
                    return true;
                }else {
                    //�ĸ����򶼲����ߵĻ���˵�������Ǹ���·������ֵΪN.
                    map[x][y]=-1;
                    return false;
                }
            }else {
                // else�����Ϊ·����ΪO�����,���ܵ����ΪY,N,#������������������ߣ�����false��
                return false;
            }
        }
	}
}


