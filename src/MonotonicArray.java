public class MonotonicArray {
    public static void main(String[] nums){
        System.out.println(isMonotonic(new int[]{1,3,3}));
    }

    public static boolean isMonotonic(int[] nums){
        boolean monotonic=true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                monotonic=false;
                break;
            }
        }

        if(monotonic) return true;

        monotonic=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                monotonic=false;
                break;
            }
        }

        return monotonic;
    }
}
