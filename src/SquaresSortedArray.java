import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String args[]){
        int s[]=sortedSquare(new int[]{-7,-3,2,3,11});

        for(int num : s){
            System.out.println(num);
        }
    }

    public static int[] sortedSquare(int[] nums){
        for(int i =0;i<nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }
}
