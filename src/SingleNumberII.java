import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{2,2,3,2}));
    }

    public static int singleNumber(int[] nums){
        Map<Integer,Integer> counterMap = new HashMap<>();

        for(int num : nums){
            if(counterMap.containsKey(num)){
                counterMap.replace(num,counterMap.get(num)+1);
            }
            else{
                counterMap.put(num,1);
            }
        }

        for(Integer key : counterMap.keySet()){
            if(counterMap.get(key)==1){
                return key;
            }
        }

        return 0;
    }
}
