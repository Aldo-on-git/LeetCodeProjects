public class NumberOfGoodPairs {
    public static void main(String args[]){
        System.out.println(numIdenticalPairs(new int[]{1,2,3}));
    }

    public static int numIdenticalPairs(int[] nums){
        int counter=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) counter++;
            }
        }

        return counter;
    }
}
