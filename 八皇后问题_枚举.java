package 算法;

public class 八皇后问题_枚举 {
    //定义棋盘
    static int[][] qipan = new int[9][9];
    public static void main(String[] args) {
        Queen();
    }
    static void Queen(){
        //定义一个标记数组 a[1] = 2表示第一列第二行有一个皇后
        int[] a = new int[9];
        //定义计数器
        int count = 0;
        int i;
            for (a[1] = 1;a[1] < 9;a[1]++)
                for (a[2] = 1;a[2] < 9;a[2]++)
                    for (a[3] = 1;a[3] < 9;a[3]++)
                        for (a[4] = 1;a[4] < 9;a[4]++)
                            for (a[5] = 1;a[5] < 9;a[5]++)
                                for (a[6] = 1;a[6] < 9;a[6]++)
                                    for (a[7] = 1;a[7] < 9;a[7]++)
                                        for (a[8] = 1;a[8] < 9;a[8]++){
                                            if(!cover(a))
                                                continue;
                                            else{
                                                count++;
                                                qipan[a[1]][1] = 1;
                                                qipan[a[2]][2] = 1;
                                                qipan[a[3]][3] = 1;
                                                qipan[a[4]][4] = 1;
                                                qipan[a[5]][5] = 1;
                                                qipan[a[6]][6] = 1;
                                                qipan[a[7]][7] = 1;
                                                qipan[a[8]][8] = 1;
                                                for (i = 1;i < 9;i++){
                                                    for (int j = 1;j < 9;j++){
                                                        System.out.print(qipan[i][j]+" ");
                                                        qipan[i][j] = 0;
                                                    }
                                                    System.out.println();
                                                }
                                                System.out.println();
                                            }
                                    }
                                    System.out.println("一共有"+count+"种方法");
    }
    static boolean cover(int a[]){
        int i = 2;
        int j = 1;
        boolean res = true;

        for(i = 2;i < 9;i++){
            for(j = 1;j <= i-1;j++){
                if((a[i] == a[j]) || ((Math.abs(a[i]-a[j])) == i -j)){
                    res = false;
                    break;
                }
            }
            if(!res)
                break;
        }
        return res;
    }
}
