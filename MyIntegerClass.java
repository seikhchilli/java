class MyInteger{
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return (value % 2 == 0);

    }

    public boolean isOdd(){
        return (value % 2 != 0);
    }

    public static boolean isEven(int val){
        return (val % 2 == 0);
    }

    public static boolean isOdd(int val){
        return (val % 2 != 0);
    }

    public boolean equals(int value){
        return (this.value == value);
    }

    public boolean equals(MyInteger i){
        return (this.value == i.getValue());
    }

    public static int parseInt(char c){
        return (int)(c - '0');
    }
}

public class MyIntegerClass {
    public static void main(String[] args){
        MyInteger num = new MyInteger(12);
        MyInteger num2 = new MyInteger(12);
        System.out.println("Value of num : " + num.getValue());
        System.out.println("num is even : " + num.isEven());
        System.out.println("num is odd : " + num.isOdd());
        System.out.println("is num equal to 13? " + num.equals(13));
        System.out.println("is num2 equal to num? " + num.equals(num2));

        System.out.println("Is 56 even? " + MyInteger.isEven(56));
        System.out.println("Is 36 odd? " + MyInteger.isOdd(36));
        
    }
    
}
