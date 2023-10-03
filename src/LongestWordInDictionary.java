import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;


//this referer to https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/description/
public class LongestWordInDictionary {
    public static void main(String[] args){
        String[] dictionary = new String[]{"ale","apple","monkey","plea"};
        System.out.println(findLongestWord("abpcplea",Arrays.asList(dictionary)));
    }

    public static String findLongestWord(String s, List<String> dictionary){
        String result = "";

        for(String word : dictionary){
            if(findContainment(s,word)){
                if(word.length()>result.length()){
                    result = word;
                }
                if(word.length()==result.length() && result.compareTo(word)>0){
                    result=word;
                }
            }
        }

        return result;
    }

    public static boolean findContainment(String s1, String s2){
        int lastIndex=-1;

        for(Character c : s2.toCharArray()){
            boolean flag= false;
            int j=0;

            while(j<s1.length() && !flag){
                if(c==s1.charAt(j) && j>lastIndex){
                    flag=true;
                    lastIndex=j;
                }

                j++;
            }

            if(!flag){
                return false;
            }
        }

        return true;
    }
}
