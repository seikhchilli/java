public class FiveSubject {
    public static void main(String args[]){
        short maths = 94, physics = 91, chemistry = 82, english = 89, painting = 93;
        short total = (short)(maths + physics + chemistry + english + painting);

        float percentage = ((float)total/500) * 100;

        System.out.println("Percentage: " + percentage);

    }
    
}
