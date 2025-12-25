class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        for(int num: nums){
            ans[num]= nums[nums[num]];
        }

        return ans;
     
        
        
    }
}