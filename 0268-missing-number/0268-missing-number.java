class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int totSum=0;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            totSum+=i;
        }
        // for(int i =0;i<n;i++){
        //     totSum+=i;
        // }
        totSum+=n;

        return totSum - currSum;
        
    }
}