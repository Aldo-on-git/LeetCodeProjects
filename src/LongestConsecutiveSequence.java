import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String args[]){
        int nums[]=new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int nums[]){
        int count=1;
        int maxCount=0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i>0){
                if(nums[i]==(nums[i-1]+1)){
                    count += 1;
                }
                else{
                    count=1;
                }
            }

            if(count>maxCount){
                maxCount=count;
            }
        }

        return maxCount;
    }
}
