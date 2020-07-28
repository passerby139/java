package 力扣;

public class 时钟指针的夹角 {
    public static void main(String[] args) {
        System.out.println(angleClock(12, 0));
    }

    public static double angleClock(int hour, int minutes) {
//        int[] arr = {0, 30, 60, 90, 120, 150, 180, 210, 240, 270, 300, 330, 360};
        double temp = 0;
        temp = Math.abs(minutes * 6 - (hour*30 + 30 * (minutes / 60.0)));
        if (temp > 180)
            return 360-temp;
        return temp;
    }
}
