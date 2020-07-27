package 力扣;

public class 螺旋数组II {
    public static void main(String[] args) {
        int[][] arr = generateMatrix(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int min = 0,max = n;
        int a = 0,b = 0;
        int temp = 1;
        while (temp <= n*n){
            for (; b < max-1; b++)
                arr[a][b] = temp++;
            if (temp >= n*n)
                break;
            for (; a < max-1; a++)
                arr[a][b] = temp++;
            for (; b > min; b--)
                arr[a][b] = temp++;
            for (; a > min; a--)
                arr[a][b] = temp++;
            a++;b++;
            min++;max--;
        }
        if (n%2 != 0){
            arr[a][b]=n*n;
        }
        return arr;
    }
}
