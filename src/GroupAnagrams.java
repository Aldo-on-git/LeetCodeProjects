import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class GroupAnagrams {
    public static void main(String[] args){
        System.out.println(isAnagram("tab","bat"));
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs.length<2){
            return Arrays.asList(List.of(strs));
        }

        List<List<String>> anagramGropus = new ArrayList<>();
        Map<String, Boolean> checkedWord = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            if(!checkedWord.containsKey(strs[i])){
                checkedWord.put(strs[i],true);
                List<String> wordGroup = new ArrayList<>();
                wordGroup.add(strs[i]);

                for(int j=i+1;j<strs.length;j++){
                    if(isAnagram(strs[i],strs[j])){
                        checkedWord.put(strs[j],true);
                        wordGroup.add(strs[j]);
                    }
                }

                anagramGropus.add(wordGroup);
            }
        }

        return anagramGropus;
    }

    public static boolean isAnagram(String word1,String word2){
        if(word1.length()!=word2.length()){
            return false;
        }

        char[] contentWord1 = word1.toCharArray();
        Arrays.sort(contentWord1);
        char[] contentWord2 = word2.toCharArray();
        Arrays.sort(contentWord2);

        return Arrays.equals(contentWord1,contentWord2);
    }
}
