import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        //int[] nums = {2,7,11,15};
        int[] nums = {3,2,3};
        int target =6;
        TwoSum ts = new TwoSum();
        ts.returnIndex(nums,target);
    }

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
    public int[] returnIndex(int[]nums, int target){
        int[] output = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
//nums =
//[3,2,3]
//target =
//6
//Output
//        [0,0]
//        Expected
//        [0,2]