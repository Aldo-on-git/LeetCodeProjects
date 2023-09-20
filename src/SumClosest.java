import static java.lang.Math.abs;

public class SumClosest {
    public static void main(String args[]){
        int nums[]=new int[]{0,0,0};
        System.out.println(threeSumClosest(nums,1));
    }

    public static int threeSumClosest(int[] nums,int target){
        int closestSum;
        int distance;

        closestSum=nums[0]+nums[1]+nums[2];
        distance = abs(target-(nums[0]+nums[1]+nums[2]));
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int x=j+1;x<nums.length;x++){
                    if(abs(target-(nums[i]+nums[j]+nums[x]))<distance){
                        distance=abs(target-(nums[i]+nums[j]+nums[x]));
                        closestSum=nums[i]+nums[j]+nums[x];
                    }
                }
            }
        }

        return closestSum;
    }
}
