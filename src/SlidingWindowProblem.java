import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SlidingWindowProblem {
    public static void main(String[] args) {
        int num[]={100,40,20,4,6,10,15,17,28,90,45,96,37,86,49,103,246,83,71,23};
        int k=6;

        int output[]= maxSlidingWindow(num,k);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int output[] = new int[nums.length-(k-1)];
        AtomicInteger outputIndex=new AtomicInteger(0);
        AtomicInteger maxNumWindow = new AtomicInteger();

        while(outputIndex.get()<output.length){
            maxNumWindow.set(-10001);
            Arrays.stream(nums,outputIndex.get(),k+outputIndex.get()).forEach(num ->{
                if(maxNumWindow.get()<num){
                    maxNumWindow.set(num);
                }
            });
            output[outputIndex.getAndIncrement()]=maxNumWindow.get();
        }

        return output;
    }
}