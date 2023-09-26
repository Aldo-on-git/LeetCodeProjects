import java.util.ArrayList;
import java.util.List;

public class KStrongestValues {
    public static void main(String[] args){
       getStrongest(new int[]{6,7,11,7,6,8},2);
    }

    public static int[] getStrongest(int []arr, int k){
        List<Integer> strongNumbers = new ArrayList<>();
        int median=arr[arr.length/2];
        int strongestCalc = 0;
        int temp;

        for(int num : arr){
            temp=Math.abs(num-median);
            if(temp>strongestCalc){
                strongestCalc=temp;
                strongNumbers.clear();
                strongNumbers.add(num);
                continue;
            }
            if(temp==strongestCalc){
                strongNumbers.add(num);
            }
        }

        System.out.println(strongestCalc);
        System.out.println(strongNumbers);


        return null;
    }
}
