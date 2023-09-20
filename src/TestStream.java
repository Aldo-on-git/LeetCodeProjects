import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String args[]){
        int nums[]=new int[]{2,6,4,7,4};
        List<Integer> lista = Arrays.stream(nums)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        nums = Arrays.stream(nums)
                .sorted()
                .filter(num -> num>4)
                .toArray();

        Arrays.stream(nums).forEach(num -> {
            System.out.println("Giggino");
            System.out.println(num);
        });

        lista.clear();

    }

    public static boolean verificaLista(List<Integer> list){
        if(list.stream().findAny().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}
