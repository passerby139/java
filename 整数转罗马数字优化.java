package 力扣;

import javax.swing.text.Element;

public class 整数转罗马数字优化 {
    public static void main(String[] args) {
        String[] flag = {"I","V","X","L","C","D","M"};//1,5,10,50,100,500,1000
        System.out.print(intToRoman(8));
    }
    public static String intToRoman(int num) {
        String str = "";
        int a = num / 1000;
        int b = num / 100 % 10;
        int c = num % 100 / 10;
        int d = num % 10;
        if (a != 0){
            for (int i = 0; i < a; i++)
                str += "M";
        }
        if (b == 9)
            str += "CM";
        else if (b == 4)
            str += "CD";
        else if (b != 0){
            for (int i = 0; i < b; i++){
                if (b >= 5){
                    str += "D";
                    b -= 4;
                    continue;
                }
                str += "C";
            }
        }
        if (c == 9)
            str += "XC";
        else if (c == 4)
            str += "XL";
        else if (c != 0){
            for (int i = 0; i < c; i++){
                if (c >= 5){
                    str += "L";
                    c -= 4;
                    continue;
                }
                str += "X";
            }
        }
        if (d == 9)
            str += "IX";
        else if (d == 4)
            str += "IV";
        else if (d != 0){
            for (int i = 0; i < d; i++){
                if (d >= 5){
                    str += "V";
                    d -= 4;
                    continue;
                }
                str += "I";
            }
        }
        return str;
    }
}
