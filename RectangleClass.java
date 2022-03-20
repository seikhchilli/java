

class Rectangle{
    private double length, width;
    
    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return (length * width);
    }

    public double getPerimeter(){
        return (2 * (length + width));
    }


}

public class RectangleClass{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 4);

        System.out.println("Area of Rectangle r1 : " + r1.getArea());
        System.out.println("Area of Rectangle r2 : " + r2.getArea());

        System.out.println("Perimeter of Rectangle r1 : " + r1.getPerimeter());
        System.out.println("Perimeter of Rectangle r2 : " + r2.getPerimeter());
    }

}