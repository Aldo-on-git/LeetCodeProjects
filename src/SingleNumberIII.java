import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
    public static void main(String[] args){
        int[] nums = singleNumber(new int[]{-1,0});
        System.out.println(Arrays.toString(nums));
    }

    public static int[] singleNumber(int nums[]){
        Map<Integer,Integer> counterMap = new HashMap<>();
        int[] resultNumber = new int[2];

        for(int num : nums){
            if(counterMap.containsKey(num)){
                counterMap.replace(num,counterMap.get(num)+1);
            }
            else{
                counterMap.put(num,1);
            }
        }

        int index=0;
        for(int key : counterMap.keySet()){
            if(counterMap.get(key)==1){
                resultNumber[index++]=key;
            }
        }

        return resultNumber;
    }
}
