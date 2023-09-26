import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Triangle {
    public static void main(String[] args){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> t = new ArrayList<>();

        triangle.add(List.of(3));
        triangle.add(List.of(9,7));
        triangle.add(List.of(4,7,2));

        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle){
        List<int[]> ways = new ArrayList<>();
        int capacity = 3;
        int[] tmp;
        ways.add(new int[]{Integer.MAX_VALUE, triangle.get(0).get(0),Integer.MAX_VALUE});
        for (int i = 1; i < triangle.size(); i++)
        {
            capacity++;
            tmp = new int[capacity];
            tmp[0] = Integer.MAX_VALUE;
            tmp[capacity - 1] = Integer.MAX_VALUE;
            for (int j = 1; j < capacity - 1; j++)
                tmp[j] = (Math.min(ways.get(i - 1)[j - 1], ways.get(i - 1)[j]) + triangle.get(i).get(j - 1));
            ways.add(tmp);
        }
        int min = ways.get(ways.size() - 1)[1];
        for (Integer num :ways.get(ways.size() - 1))
            min = Math.min(min, num);
        return min;
    }
}
