class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int left =0;
        int right = n-1;

        if(n%2!=0){
        int mid = (left+right)/2;
        nums[mid]= nums[mid]*nums[mid];
        }
      
        while(left<right){
         
            nums[left]= nums[left]*nums[left];
            nums[right]= nums[right]*nums[right];
            left++;
            right--;
        }
       
        Arrays.sort(nums);
        return nums;
        
    }
}