package ���ű�;

import java.util.Scanner;

class Fibonacci{
    private int number;//˽������

    public Fibonacci(int number){//���췽�������ɶ���ʱʹ�ã�
        this.number=number;//ʵ�������󣬴�ʱthis���ñ�������
        //���췽����Ϊ������������ʼ�������������췽���ĵ��úͶ����ڴ���伸����ͬ����ɵ�
    }

    public int result(int number){//��ͨ����
        if(number==1){
            return 1;
        }
        else if(number==2){
            return 1;
        }
        else{
            return result(number-1)+result(number-2);//�ݹ�
        }
    }
}

 class Test{//����
    public static void main(String[] args){
    	Scanner scanf = new Scanner(System.in);
    	int n = scanf.nextInt();
        Fibonacci num=new Fibonacci(n);
        //����Fibonacci������һ��Fibonacci���󣬶������ƽ���num
            System.out.print(num.result(n)%10007);
    }
}