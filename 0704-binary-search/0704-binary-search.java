class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;

         while(n==1){
            int mid=0;
            if(nums[mid]==target){
                return mid;
            }else{
                return -1;
            }
           }

        int start =0;
        int end=n-1;
        
        while(start<=end){
            int mid=(start+end)/2;
          
            if(nums[mid]==target){
                return mid;
            } if(nums[mid]<target){
                start=mid;
                start++;
            }
            if(nums[mid]>target){
                end = mid;
                end--;
            }
           

        }





        return -1;

        
    }
}