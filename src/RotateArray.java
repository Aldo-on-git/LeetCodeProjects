import java.util.Arrays;

public class RotateArray {
    public static void main(String args[]){
        int nums[]=new int[]{1,2,3};
        rotate(nums,2);
    }

    public static void rotate(int []nums,int k){
        if(k>0){
            if(k>nums.length){
                k=k%nums.length;
            }

            int indexSupp=0;
            int suppNums[]=new int[nums.length];

            for(int i=nums.length-k;i<nums.length;i++){
                suppNums[i-(nums.length-k)]=nums[i];
                indexSupp++;
            }

            for(int i=0;i<nums.length-k;i++){
                suppNums[indexSupp]=nums[i];
                indexSupp++;
            }

            for(int i=0;i<nums.length;i++){
                nums[i]=suppNums[i];
            }
        }
    }
}
