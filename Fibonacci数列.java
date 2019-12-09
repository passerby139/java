package 蓝桥杯;

import java.util.Scanner;

class Fibonacci{
    private int number;//私有属性

    public Fibonacci(int number){//构造方法（生成对象时使用）
        this.number=number;//实例化对象，此时this调用本类属性
        //构造方法可为类中属性做初始化操作，是因构造方法的调用和对象内存分配几乎是同步完成的
    }

    public int result(int number){//普通方法
        if(number==1){
            return 1;
        }
        else if(number==2){
            return 1;
        }
        else{
            return result(number-1)+result(number-2);//递归
        }
    }
}

 class Test{//主类
    public static void main(String[] args){
    	Scanner scanf = new Scanner(System.in);
    	int n = scanf.nextInt();
        Fibonacci num=new Fibonacci(n);
        //根据Fibonacci类生成一个Fibonacci对象，对象名称叫做num
            System.out.print(num.result(n)%10007);
    }
}