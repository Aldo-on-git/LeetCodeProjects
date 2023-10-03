import java.util.Arrays;
import java.util.List;

//this referer to https://leetcode.com/problems/longest-word-in-dictionary/description/
public class LongestWordInDictionaryII {
    public static void main(String[] main){
        System.out.println(findLongestWord(new String[]{"a","banana","app","appl","ap","apply","apple"}));
    }

    public static String findLongestWord(String[] words){
        String result = "";
        List<String> wordList = Arrays.asList(words);

        for(String word : wordList){
            if(canBeBuilt(word,wordList)){
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

    public static boolean canBeBuilt(String word, List<String> wordList){
        String s="";

        for(int i=0;i<word.length()-1;i++){
            s=s + word.charAt(i);

            if(!wordList.contains(s)){
                return false;
            }
        }

        return true;
    }
}
