package 力扣;

public class 丑数优化 {
    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
    public static boolean isUgly(int num) {
        if (num <= 0){
            return false;
        }
        if (num == 1)
            return true;
        if (num % 5 == 0)
            num = num / 5;
        else if (num % 3 == 0)
            num = num / 3;
        else if (num % 2 == 0)
            num = num / 2;
        else {
            return false;
        }
        return isUgly(num);
    }
}
