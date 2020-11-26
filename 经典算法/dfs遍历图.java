package 经典算法;

/**
 * 何为dfs遍历地图迷宫，就是一条路走到黑，每进行一步就按照方向的给定
 * 顺序，先朝一个方向走，当走不通之后，末端就会被认定为一条死节点（即：
 * 四个方向都已经被堵住）这个时候会返回false以表示此路不通，然后他的
 * 父节点就会去考虑去转向下一个方法，如果父节点的四周都是死节点，那么
 * 父节点也会被认定为死节点，依次递归推理，当某一条探头找到了终点，
 * 那么就走出了迷宫！！！
 */

import java.util.*;
public class dfs遍历图 {
	public static void main(String[] args) {
		int[][] map = new int[7][7];
		Scanner in = new Scanner(System.in); 
		
		//输入地图
		for(int i = 0;i < 7;i++) {
			for(int j = 0;j < 7;j++) {
				map[i][j] = in.nextInt();
			}
		}
		walking(map,1,1);
		System.out.println("---上帝视角迷宫可行路线地形图：---");
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
            //map[8][8] 为终点，即终点走过的时候，结束。
            return true;
        }else {
            if (map[x][y]==0){ // 为O即可走，
                map[x][y] = 2; //走过为Y。
                //判断下右上左四个方向是否可以走。
                if (walking(map,x+1,y)){
                    return true;
                }else if (walking(map,x,y+1)){
                    return true;
                }else if (walking(map,x-1,y)){
                    return true;
                }else if (walking(map,x,y-1)){
                    return true;
                }else {
                    //四个方向都不可走的话，说明这里是个死路，即赋值为N.
                    map[x][y]=-1;
                    return false;
                }
            }else {
                // else的情况为路况不为O的情况,可能的情况为Y,N,#。这三种情况都不能走，返回false。
                return false;
            }
        }
	}
}


