class Solution {
    public int repeatedNTimes(int[] nums) {

        int len = nums.length;

       // int count =0;
        int result=0;
        for(int i =0;i<len;i++){
            int count=0;
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>0){
                result = nums[i];
            }
        }
        
        return result;
    }
}