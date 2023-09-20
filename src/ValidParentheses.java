import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String args[]){
        String s="([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        boolean validString=false;
        int i=0;

        if(s.length()%2!=0){
            return false;
        }
        while(i<s.length()){
            if(s.charAt(i)!='[' && s.charAt(i)!='(' && s.charAt(i)!='{'){
                return false;
            }
            else{
                String sub="";
                if(s.charAt(i)=='('){
                    sub=generateSubstring(s,i,')');
                }
                if(s.charAt(i)=='['){
                    sub=generateSubstring(s,i,']');
                }
                if(s.charAt(i)=='{'){
                    sub=generateSubstring(s,i,'}');
                }

                if(sub.equals("none")){
                    return false;
                }
                else{
                    i += sub.length();
                }
            }

            if(i>=s.length()-1){
                validString=true;
            }
        }

        return validString;
    }

    public static String generateSubstring(String s, int start,char par){
        String sub="";
        int i=start;
        boolean flagFoundClousure=false;

        while(i<s.length()){
            sub=sub+s.charAt(i);
            if(s.charAt(i)==par){
                i=s.length();
                flagFoundClousure=true;
            }
            i++;
        }

        if(!flagFoundClousure){
            return "none";
        }
        return sub;
    }
}
