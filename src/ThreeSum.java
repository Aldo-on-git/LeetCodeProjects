import java.util.*;

public class ThreeSum {
    public static void main(String args[]){
        int nums[]= new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> output = threeSum(nums);
        System.out.println(output.toString());
    }

    public static List<List<Integer>> threeSum(int []nums){
        List<List<Integer>> threeSumList = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i+1;
            int end = nums.length-1;

            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                    threeSumList.add(Arrays.asList(nums[i],nums[start],nums[end]));

                    while(start<end && nums[start]==nums[start+1]){
                        start++;
                    }

                    while(end>start && nums[end]==nums[end-1]){
                        end--;
                    }

                    end -= 1;
                    start += 1;
                }
                else if(sum>0){
                    end -= 1;
                }
                else{
                    start += 1;
                }
            }
        }


        return threeSumList;
    }
}
