import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class SortCharacterByFrequency {
    public static void main(String[] args){
        System.out.println(frequencySort("cccaaa"));
    }

    public static String frequencySort(String s){
        Map<Character,Integer> frequencyCharMap = new HashMap<>();
        AtomicReference<String> result= new AtomicReference<>("");

        for(int i=0;i<s.length();i++){
            if(frequencyCharMap.containsKey(s.charAt(i))){
                frequencyCharMap.replace(s.charAt(i),frequencyCharMap.get(s.charAt(i))+1);
            }
            else{
                frequencyCharMap.put(s.charAt(i),1);
            }
        }

        frequencyCharMap.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k ->{
            for(int i=0;i<k.getValue();i++){
                result.set(result.get() +k.getKey());
            }
        });

        return result.get();
    }
}
