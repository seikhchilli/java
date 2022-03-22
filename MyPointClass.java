import java.lang.Math;
class MyPoint{
    private double x, y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(double x, double y){
        return Math.sqrt((x - this.x) * (x - this.x)  + (y - this.y)*(y - this.y));
    }

    public double distance(MyPoint m){
        return Math.sqrt((m.x - this.x)*(m.x - this.x) + (m.y - this.y)*(m.y - this.y));
    }
}

public class MyPointClass {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Distance between p1 and p2 : " + p1.distance(p2));
        System.out.println("Distance between p1 and (4, 3) : " + p1.distance(4, 3));

    }
}
