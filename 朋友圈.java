package leeCode;

import java.util.*;

public class ����Ȧ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[4][4];
		
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(findCircleNum(arr));
	}
    public static int findCircleNum(int[][] M) {
    	//����ʵ��
    	List<people> friend = new LinkedList<people>();
    	for(int i = 0;i < M[0].length;i++) {
    		friend.add(new people(i));
    	}
    	//�������ȫ��0
    	int[] flag = new int[M[0].length];
    	//������ϵͼ
    	for(int i = 0;i < M[0].length;i++) {
    		if(i < M[0].length-1) {
        		for(int j = i+1;j < M[0].length;j++) {
        			//�������Լ�������(i��ͬѧ��j��ͬѧ���� �����ѹ�ϵ)
        			if(M[i][j] == 1) {
        				friend.get(i).list.add(friend.get(j));
        				friend.get(j).list.add(friend.get(i));
        			}
        		}
    		}
    	}
    	int sum = 0;
    	for(int i = 0;i < friend.size();i++) {
    		if(flag[friend.get(i).var] == 0) {
    			sum++;
    	    	findFriend(friend.get(i),flag,sum);
    		}
    	}
    	for(people temp:friend) {
    		System.out.print("\n"+temp.var+"�ŵ����Ѷ��У�");
    		for(people next:temp.list) {
    			System.out.print(next.var+" ");
    		}
    	}
		System.out.print("\n");
    	for(int i : flag) {
    		System.out.print(i+" ");
    	}
    	return sum;
    }
    public static void findFriend(people head,int[] flag,int num) {
    	if(flag[head.var]!=0) {
    		return;
    	}else {
        	flag[head.var] = num;
        	for(int i = 0;i < head.list.size();i++)
        	    findFriend(head.list.get(i),flag,num);
        	return;
    	}
    	
    }
}
class people {
	int var;
	List<people> list = new LinkedList<people>();
	public people (int var) {
		this.var = var;
	}
}
