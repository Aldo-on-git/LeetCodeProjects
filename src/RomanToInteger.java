import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String args[]){
        String s ="XIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s){
        int sum=0;
        Map<Character,Integer> romanCharacter = new HashMap<>();


        romanCharacter.put('I',1);
        romanCharacter.put('V',5);
        romanCharacter.put('X',10);
        romanCharacter.put('L',50);
        romanCharacter.put('C',100);
        romanCharacter.put('D',500);
        romanCharacter.put('M',1000);

        sum += romanCharacter.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(romanCharacter.get(s.charAt(i))<romanCharacter.get(s.charAt(i+1))){
                sum -= romanCharacter.get(s.charAt(i));
            }
            else{
                sum += romanCharacter.get(s.charAt(i));
            }
        }

        return sum;
    }
}
