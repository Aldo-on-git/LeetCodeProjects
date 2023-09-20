import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class toKFrequent {
    public static void main(String args[]){
        int solution[]=toKFrequent(new int[]{1},1);

        for(int num : solution){
            System.out.println(num);
        }
    }

    public static int[] toKFrequent(int[] nums,int k){
        int solution[]=new int[k];
        AtomicInteger index = new AtomicInteger(0);
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(Integer num : nums){
            if(frequencyMap.containsKey(num)){
                frequencyMap.replace(num,frequencyMap.get(num)+1);
            }
            else{
                frequencyMap.put(num,1);
            }
        }

        frequencyMap.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).limit(k)
                .forEach((key-> {
                    solution[index.getAndIncrement()]= key.getKey();
                }));

        return solution;
    }
}
