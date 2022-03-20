import java.util.Random;

class Stopwatch{
    private long startTime, endTime;

    public Stopwatch(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();

    }

    public void stop(){
        endTime = System.currentTimeMillis();

    }

    public long getElapsedTime(){
        return (endTime - startTime);
    }

}


public class StopwatchClass {
    public static void main(String[] args){
        int arr[] = new int[10000000];

        Random rd = new Random();

        for(int i = 0; i < 10000000; i++){
            arr[i] = rd.nextInt();
        }

        Stopwatch s = new Stopwatch();
        s.start();
        selectionSort(arr);
        s.stop();


        System.out.println("Time taken to sort : " + s.getElapsedTime());


    }

    public static void selectionSort(int[] arr){
        int mini;
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            mini = i;
            for(int j = i+1; j < n; j++){
                if(arr[i] < arr[mini]){
                    mini = j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i]= temp;
        }


    }
}
