class Solution {
    public int removeDuplicates(int[] nums) {

        int index=1;
        int count=0;
        
        for(int i =1;i<nums.length;i++){
           
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=0;
            }
            if(count<2){
                nums[index++]=nums[i];
            }

           
        }
        return index;


        
    }
}