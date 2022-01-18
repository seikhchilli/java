public class StackRun {
    public static void main(String args[]){
        Stacks mystack1 = new Stacks(10);

        for(int i = 0; i < 11; i++){
            mystack1.push(i);
        }

        for(int i = 0; i < 12; i++){
            System.out.println(mystack1.pop());
        }
    }
    
}
