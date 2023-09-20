public class MoveZeroes {
    public static void main(String args[]){
    }

    public void moveZeroes(int [] nums){
        int nArray[] = new int[nums.length];
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nArray[count++]=nums[i];
            }
        }

        for(int i=count;i<nums.length-count;i++){
            nArray[i]=0;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=nArray[i];
        }
    }
}
