package 蓝桥杯;

import java.util.Calendar;

public class 省_世纪末的星期 {
    public static void main(String[] args) {
        Calendar dar = Calendar.getInstance();
        for(int year = 1999;year < 100000;year+=100){
            dar.set(dar.YEAR,year);
            dar.set(dar.MONTH,11);
            dar.set(Calendar.DAY_OF_MONTH,31);
            if(dar.get(dar.DAY_OF_WEEK) == 1){
                System.out.println(year);break;
            }
        }
    }
}
