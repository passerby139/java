package 经典算法;
import java.util.*;

//何为bfs遍历迷宫算法，就是扩散问题，在每一个点，在条件允许的情况下，
//依次向下，右，上，左来进行扩散，因为是广度所以设计的方向广，触角也就
//触及的长，当某一触角率先触及到终点时，我们就认为找到了出口，然后利用
//回溯思想将这条走过的路记录下来。

/**
 * 龍龍
 * @author Administrator
 *那么如何完成这一个过程，首先我们要利用一个flag标记数组，来记录自己是否
 *走过这条路，并逐次加一，便于后期回溯，其次，我们要利用队列来记录每次向，
 *四周扩散的应该是哪一个点，当所有点都扩散完毕时依旧没有找到出口，证明该
 *迷宫不存在通路（遇到通路立即跳出遍历，即已求出最短路径！），
 */

public class bfs遍历图 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //方向数组
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        //原始数组
        int[][] map = new int[7][7];
        //记录数组
        int[][] flag = new int[7][7];
        
        //数组赋值
        for(int i = 0;i < 7;i++) {
        	for(int j = 0;j < 7;j++) {
        		map[i][j] = sc.nextInt();
        	}
        }
        //创建第一个坐标结点
        Node first = new Node(1,1);
        //过程队列，记录结点坐标
        Queue<Node> queue = new LinkedList<>();
        //队列添加第一个要向四周扩散的结点
        queue.add(first);
        
        while(!queue.isEmpty()) {
        	//过程记录结点
        	Node temp = null;
        	//接受本次要向四周扩散的结点坐标
        	temp = queue.poll();
        	//当找到出口时，退出过程寻找
    		if(temp.x == 5 && temp.y == 5) {
    			break;
        	}
    		//将当前结点向四周依次扩散
        	for(int i = 0;i < 4;i++) {
	        	int nx = temp.x + dx[i];
	        	int ny = temp.y + dy[i];
	        	//判断能否向该方向扩散
        		if(0 <= nx && nx < 7 && 0 <= ny && ny < 7) {
        			if(map[nx][ny] != 1 && flag[nx][ny] == 0) {
        				//如果各项条件满足，则创建新结点
        				Node next = new Node(nx,ny);
        				//新结点入队列
						queue.add(next);
						//记录数组进行绘制
						flag[nx][ny] = flag[temp.x][temp.y]+1;
        			}
        		}
        	}
        }
        //打印记录数组
        for(int i = 0;i < 7;i++) {
        	for(int j = 0;j < 7;j++) {
        		System.out.print(flag[i][j] + "  ");
        	}
        	System.out.println();
        	System.out.println();
        }
        //**********************************回溯*******************************
        //创建栈结构来存储路径
        Stack<Map<Integer,Integer>> stack = new Stack();
        //回溯以终点为起点
        int add = flag[5][5];
        int i = 5;int j = 5;
        while(add >= 1) {
        	add--;
        	//依次从左边和上边两个方向判断来源，合适则以map的形式存储并入栈
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
        //回溯完成之后，则输出走过的路程
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

