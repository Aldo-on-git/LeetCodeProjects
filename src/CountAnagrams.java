import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CountAnagrams {
    public static void main(String[] args){
        System.out.println(countAnagrams("ptx cccbhbq"));
    }

    public static int countAnagrams(String s){
        String[] wordArray = s.split(" ");
        long result = 1;


        for(int i=0;i<wordArray.length;i++){
            int calculation = 1;
            int equalCharDividend = equalCharDividend(wordArray[i]);

            for(int j=1;j<wordArray[i].length()+1;j++){
                calculation *= j;
            }

            calculation /= equalCharDividend;
            result *= calculation;
        }

        return calculateModulo(result);
    }

    public static int calculateModulo(long n) {
        int MOD = 1000000007; // 10^9 + 7
        return (int) (((n % MOD) + MOD) % MOD);
    }

    public static int equalCharDividend(String word){
        Map<Character,Integer> mapChar = new HashMap<>();
        AtomicInteger result = new AtomicInteger(1);

        for(Character c : word.toCharArray()){
            if(mapChar.containsKey(c)){
                mapChar.replace(c, mapChar.get(c)+1);
            }
            else{
                mapChar.put(c,1);
            }
        }

        mapChar.values().forEach(value ->{
            int calculation = 1;

            for(int j=1;j<value+1;j++){
                calculation *= j;
            }

            result.set(result.get() * calculation);
        });

        return result.get();
    }
}
