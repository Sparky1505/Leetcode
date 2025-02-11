class Solution {
    public int arraySign(int[] nums) {

        long n = nums.length;

        int mul=1;

        for(int i=0;i<n;i++){
           // mul*=nums[i];
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                mul=-mul;
            }     
        }
        return mul;
    }
}