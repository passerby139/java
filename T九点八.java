package 小练习;

public class T九点八 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(10,"黄色");
        Fan fan2 = new Fan(10,"黄色");
        fan1.setSpeed(fan1.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("蓝色");
        System.out.println(fan2.toString());
    }
}

class Fan{
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = FAST;
    private  boolean on = false;
    private  double radius = 5;
    private String color = "蓝色";

    public Fan(){}
    public Fan(double radius,String color){
        on = true;
        this.radius = radius;
        this.color = color;
    }
    public  void setSpeed(int speed) {
        this.speed = speed;
    }

    public  void setOn(boolean on) {
        this.on = on;
    }

    public  void setRadius(double radius) {
        this.radius = radius;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    public  int getSpeed() {
        return speed;
    }

    public  double getRadius() {
        return radius;
    }

    public  boolean getOn() {
        return on;
    }
    public String getColor(){
        return color;
    }

    public String toString(){
        if(on)
            return ("当前电风扇已打开，风速为："+speed+" 颜色为："+color+" 半径为："+radius);
        else
            return ("当前电风扇已关闭，风速为："+speed+" 颜色为："+color+" 半径为："+radius);
    }
}