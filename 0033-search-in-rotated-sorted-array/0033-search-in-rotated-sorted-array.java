class Solution {
    public int search(int[] nums, int target) {
            // this is not the optimal and in the required constraint
            // it has to be in log n but in O(n)
            // to learn the optimize approch and implement it
        int result =-1;
        for(int i=0;i<nums.length;i++ ){
            if(nums[i]==target){
                result = i;
            }
        }
        return result;
    }
}