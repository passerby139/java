package 力扣;

public class 整数转罗马数字 {
    public static void main(String[] args) {
        System.out.print(intToRoman(8));
    }
    public static String intToRoman(int num) {
        String[] flag = {"I","V","X","L","C","D","M"};//1,5,10,50,100,500,1000
        String str = "";

        while (num != 0){
            if (num >= 1000) {
                str += flag[6];
                num -= 1000;
                continue;
            }else if(num / 100 == 9) {
                str += "CM";
                num -= 900;
                continue;
            }
            if (num >= 500) {
                str += flag[5];
                num -= 500;
                continue;
            }else if(num / 100 == 4) {
                str += "CD";
                num -= 400;
                continue;
            }
            if (num >= 100) {
                str += flag[4];
                num -= 100;
                continue;
            }else if(num / 10 == 9) {
                str += "XC";
                num -= 90;
                continue;
            }
            if (num >= 50) {
                str += flag[3];
                num -= 50;
                continue;
            }else if(num / 10 == 4) {
                str += "XL";
                num -= 40;
                continue;
            }
            if (num >= 10) {
                str += flag[2];
                num -= 10;
                continue;
            }else if(num  == 9) {
                str += "IX";
                num -= 9;
                continue;
            }
            if (num >= 5) {
                str += flag[1];
                num -= 5;
                continue;
            }else if(num  == 4) {
                str += "IV";
                num -= 4;
                continue;
            }
            str += flag[0];
            num--;
        }
        return str;
    }
}
