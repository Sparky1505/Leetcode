class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;

        int start =0;
        int end=n-1;

        while(start<=end){
 
            
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                start=mid;
                start++;
            }
            else if(nums[mid]>target){
                end=mid;
                end--;
            }else return mid;
            
        }
        return start;
    }
}