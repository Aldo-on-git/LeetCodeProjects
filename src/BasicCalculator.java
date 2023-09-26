import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args){
        System.out.println(calculate("54+8/4+20-10"));
    }

    public static int calculate(String s){
        Stack<Integer> st=new Stack();
        int number=0;
        int result=0;
        char operator='+';

        char[] ch =s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i])){
                number=number*10+ch[i]-'0';
            }
            System.out.println(number);

            if(!Character.isDigit(ch[i]) && ch[i]!=' ' || i==ch.length-1)
            {
                if(operator=='+')
                    st.push(number);
                else if(operator=='-')
                    st.push(-number);
                else if(operator=='*')
                    st.push(st.pop()*number);
                else if(operator=='/')
                    st.push(st.pop()/number);
                number=0;
                operator=ch[i];

            }
        }

        while(!st.isEmpty())
        {
            result+=st.pop();
        }

        return result;
    }
}
