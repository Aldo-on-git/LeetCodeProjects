public class SearchSortedArray {
    public static void main(String args[]){
        int nums[]=new int[]{1};
        System.out.println(search(nums,0));
    }

    public static int search(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        return -1;
    }
}
