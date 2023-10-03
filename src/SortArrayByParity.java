import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayByParity {
    public static void main(String[] args){
        int[] numbers = sortArrayByParity(new int[]{3,1,2,4});
        for(int num : numbers){
            System.out.println(num);
        }
    }

    public static int[] sortArrayByParity(int[] nums){
        int[] sortedByParity = new int[nums.length];
        int parityIndex=0;

        for(int num : nums){
            if(num%2==0){
                sortedByParity[parityIndex++]=num;
            }
        }

        for(int num : nums){
            if(num%2!=0){
                sortedByParity[parityIndex++]=num;
            }
        }

        return sortedByParity;
    }
}
