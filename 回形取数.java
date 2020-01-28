package 蓝桥杯;

import java.util.Scanner;

public class 回形取数 {	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int m = in.nextInt(),n = in.nextInt();
        int [][]a = new int[m][n];
        for(int i = 0;i<m;i++) 
            for(int j = 0;j<n;j++) 
                a[i][j] = in.nextInt();
        int [][]flag = new int[m][n];
        System.out.print(a[0][0]);
        flag[0][0]=1;
        int i = 1,j = 0,cnt = 1;
        while (cnt < n * m) 
        {
            //down
            while (i < m && flag[i][j] == 0 ) 
            {
                flag[i][j] = 1;
                System.out.print(" " + a[i++][j]);
                cnt++;
            }
            i--;j++;
            //right
            while ( j<n && flag[i][j] == 0)
            {
                flag[i][j] = 1;
                System.out.print(" " + a[i][j++]);
                cnt++;
            }
            j--;i--;
            //up
            while (i>= 0 && flag[i][j] == 0) 
            {
                flag[i][j] = 1;
                System.out.print(" " + a[i--][j]);
                cnt++;
            }
            i++;j--;
            //left
            while (j>=0 && flag[i][j] == 0) 
            {
                flag[i][j] = 1;
                System.out.print(" " + a[i][j--]);
                cnt++;
            }
            j++;i++;
        }
        System.out.println();
    }  
}
