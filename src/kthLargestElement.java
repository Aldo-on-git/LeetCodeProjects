import java.util.Arrays;

public class kthLargestElement {
    public static void main(String args[]){
        int nums[]=new int[]{3,2,1,5,6,4};
        findKthLargest(nums,2);
    }

    public static int findKthLargest(int []nums,int k){
        Arrays.sort(nums);

        return nums[nums.length-k];
    }
}
