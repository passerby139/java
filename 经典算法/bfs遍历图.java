package �����㷨;
import java.util.*;

//��Ϊbfs�����Թ��㷨��������ɢ���⣬��ÿһ���㣬���������������£�
//�������£��ң��ϣ�����������ɢ����Ϊ�ǹ��������Ƶķ���㣬����Ҳ��
//�����ĳ�����ĳһ�������ȴ������յ�ʱ�����Ǿ���Ϊ�ҵ��˳��ڣ�Ȼ������
//����˼�뽫�����߹���·��¼������

/**
 * ����
 * @author Administrator
 *��ô��������һ�����̣���������Ҫ����һ��flag������飬����¼�Լ��Ƿ�
 *�߹�����·������μ�һ�����ں��ڻ��ݣ���Σ�����Ҫ���ö�������¼ÿ����
 *������ɢ��Ӧ������һ���㣬�����е㶼��ɢ���ʱ����û���ҵ����ڣ�֤����
 *�Թ�������ͨ·������ͨ·������������������������·��������
 */

public class bfs����ͼ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //��������
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        //ԭʼ����
        int[][] map = new int[7][7];
        //��¼����
        int[][] flag = new int[7][7];
        
        //���鸳ֵ
        for(int i = 0;i < 7;i++) {
        	for(int j = 0;j < 7;j++) {
        		map[i][j] = sc.nextInt();
        	}
        }
        //������һ��������
        Node first = new Node(1,1);
        //���̶��У���¼�������
        Queue<Node> queue = new LinkedList<>();
        //������ӵ�һ��Ҫ��������ɢ�Ľ��
        queue.add(first);
        
        while(!queue.isEmpty()) {
        	//���̼�¼���
        	Node temp = null;
        	//���ܱ���Ҫ��������ɢ�Ľ������
        	temp = queue.poll();
        	//���ҵ�����ʱ���˳�����Ѱ��
    		if(temp.x == 5 && temp.y == 5) {
    			break;
        	}
    		//����ǰ���������������ɢ
        	for(int i = 0;i < 4;i++) {
	        	int nx = temp.x + dx[i];
	        	int ny = temp.y + dy[i];
	        	//�ж��ܷ���÷�����ɢ
        		if(0 <= nx && nx < 7 && 0 <= ny && ny < 7) {
        			if(map[nx][ny] != 1 && flag[nx][ny] == 0) {
        				//��������������㣬�򴴽��½��
        				Node next = new Node(nx,ny);
        				//�½�������
						queue.add(next);
						//��¼������л���
						flag[nx][ny] = flag[temp.x][temp.y]+1;
        			}
        		}
        	}
        }
        //��ӡ��¼����
        for(int i = 0;i < 7;i++) {
        	for(int j = 0;j < 7;j++) {
        		System.out.print(flag[i][j] + "  ");
        	}
        	System.out.println();
        	System.out.println();
        }
        //**********************************����*******************************
        //����ջ�ṹ���洢·��
        Stack<Map<Integer,Integer>> stack = new Stack();
        //�������յ�Ϊ���
        int add = flag[5][5];
        int i = 5;int j = 5;
        while(add >= 1) {
        	add--;
        	//���δ���ߺ��ϱ����������ж���Դ����������map����ʽ�洢����ջ
        	if(i >= 0 && j-1 >= 0 && flag[i][j-1] == add) {
        		Map map1 = new HashMap<Integer, Integer>();
        		map1.put(i, j-1);
        		stack.push(map1);
        		j--;
        		continue;
        	}else if(i-1 >= 0 && j >= 0 && flag[i-1][j] == add) {
        		Map map1 = new HashMap<Integer, Integer>();
        		map1.put(i-1, j);
        		stack.push(map1);
        		i--;
        		continue;
        	}
        }
        //�������֮��������߹���·��
        while(!stack.isEmpty()) {
        	Map map1 = stack.pop();
        	System.out.println(map1);
        }
        
    }

}
class Node{
    int x;
    int y;
    public Node(int x,int y){
        this.x = x;
        this.y = y;
    }

}

