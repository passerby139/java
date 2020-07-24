package 力扣;

public class 整数转罗马数字贪心 {
    public static void main(String[] args) {
        System.out.print(intToRoman(8));
    }
    public static String intToRoman(int num) {
        String[] flag = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};//1,5,10,50,100,500,1000
        String str = "";
        while (num != 0){
            if (num >= 1000){
                str += flag[0];
                num -= 1000;
                continue;
            }else if(num >= 900){
                str += flag[1];
                num -= 900;
                continue;
            }else if(num >= 500){
                str += flag[2];
                num -= 500;
                continue;
            }else if(num >= 400){
                str += flag[3];
                num -= 400;
                continue;
            }else if(num >= 100){
                str += flag[4];
                num -= 100;
                continue;
            }else if(num >= 90){
                str += flag[5];
                num -= 90;
                continue;
            }else if(num >= 50){
                str += flag[6];
                num -= 50;
                continue;
            }else if(num >= 40){
                str += flag[7];
                num -= 40;
                continue;
            }else if(num >= 10){
                str += flag[8];
                num -= 10;
                continue;
            }else if(num >= 9){
                str += flag[9];
                num -= 9;
                continue;
            }else if(num >= 5){
                str += flag[10];
                num -= 5;
                continue;
            }else if(num >= 4){
                str += flag[11];
                num -= 4;
                continue;
            }
            str += flag[12];
            num--;
        }
        return str;
    }
}
