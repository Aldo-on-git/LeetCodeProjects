import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String args[]){

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new java.util.HashMap<>();
        int i=0;
        int result;

        while(true){
            result=target-nums[i];
            if(numMap.containsKey(result)){
                return new int[]{numMap.get(result),i};
            }
            numMap.put(nums[i],i);
            i++;
        }
    }
}
