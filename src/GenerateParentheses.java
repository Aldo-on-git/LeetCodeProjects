import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses{
    public static void main(String args[]){

    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        recorsive(list, "", n, n);
        return list;
    }

    public static void recorsive(List<String> list, String str, int left, int right) {
        if(left == 0 && right == 0){
            list.add(str);
        }

        if(left > 0){
            recorsive(list, str + "(", left - 1, right);
        }


        if(right > left){
            recorsive(list, str + ")", left, right - 1);
        }

    }
}
