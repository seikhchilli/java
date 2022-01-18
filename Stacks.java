public class Stacks{
    int stck[];
    int tos;
    int capacity;

    Stacks(int size){
        capacity = size;
        stck = new int[capacity];
        tos = -1;
    }

    void push(int key){
        if(tos == capacity - 1){
            System.out.println("Buffer Overflow");
            return;
        }
        tos++;
        stck[tos] = key;
    }

    int pop(){
        if(tos == -1){
            System.out.println("Buffer Underflow");
            return -1;
        }
        else{
            return stck[tos--];
        }
    }

    boolean isEmpty(){
        if(tos == -1){
            return true;
        }
        else{
            return false;
        }
    }

}