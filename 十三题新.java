package 小练习;

/*
 * a,b,c,d,e获得前五名，解题的前提是他们名次各不相同，且每人的话只有一句是正确的，利用四层嵌套循环，
 * 挨个枚举尝试，在先保证名次不同的情况下，再挨个验证是否符合他们说的话，且正确率需达到一半，java中
 * 含有布尔数据类型，因此不能简单的逻辑值相加为1来判断，需要更繁琐的依次判断。
 */

public class 十三题新 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        //依次遍历每个人可能得到的成绩
        for(a = 1;a <= 5;a++){
            for(b = 1;b <= 5;b++){
                if(a != b){
                    for (c = 1;c <= 5;c++){
                        if (c != a && c != b){
                            for(d = 1;d <= 5;d++){
                                if(d != a && d != b && d != c){
                                    e = 15 - a - b - c - d;
                                    if (e != a && e != b && e != c && e != d) {
                                        if((((b != 3) && (c == 5)) || ((b == 3) && (c != 5))) && (((d != 2) && (e == 4)) || ((d == 2) && (e != 4))) && (((b != 1) && (e == 4)) || ((b == 1) && (e != 4))) && (((b != 2) && (c == 1)) || ((b == 2) && (c != 1))) && (((d != 2) && (a == 3)) || ((d == 2) && (a != 3)))){
                                            System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+d+" e:"+e);
                                        }
                                    }
                                }

                            }
                        }

                    }
                }

            }
        }


    }
}
