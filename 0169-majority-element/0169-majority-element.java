class Solution {
    public int majorityElement(int[] nums) {
      int max=nums.length/2;
      HashMap<Integer,Integer> map1= new HashMap<>();
      for(int i =0;i<nums.length;i++){
        int count = map1.getOrDefault(nums[i],0)+1;
        map1.put(nums[i],count);
        if(count>max){
            return nums[i];
        }
      }
      
      
      return -1;
        
    }
}