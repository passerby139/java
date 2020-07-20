package 力扣;

public class 丑数 {
    public static void main(String[] args) {
        System.out.println(isUgly(1));
    }
    public static boolean isUgly(int num) {
        while (true){
            if(num % 2 != 0)
                break;
            else
                num = num / 2;
        }
        while (true){
            if(num % 3 != 0)
                break;
            else
                num = num / 3;
        }
        while (true){
            if(num % 5 != 0)
                break;
            else
                num = num / 5;
        }
        if (num == 1)
            return true;
        else
            return false;
    }
}
