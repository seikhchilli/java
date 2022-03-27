class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI)*radius * radius;
    }

}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle c2){
        if(c2.getArea() < super.getArea()){
            return 1;
        }
        else if(c2.getArea() > super.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class ComparableCircleClass {
    public static void main(String[] args){
        ComparableCircle c1 = new ComparableCircle(72);
        ComparableCircle c2 = new ComparableCircle(64);

        if(c1.compareTo(c2) == 1){
            System.out.println("c1 is bigger than c2.");
        }
        else if(c1.compareTo(c2) == -1){
            System.out.println("c1 is smaller than c2.");
        }
        else{
            System.out.println("c1 is equal to c2.");
        }
    }
}
