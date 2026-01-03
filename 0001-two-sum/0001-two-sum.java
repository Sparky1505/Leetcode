class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer,Integer> sumMap = new HashMap<>();
        for(int i =0;i<n;i++){
            int diff = target - nums[i];
            if(sumMap.containsKey(diff)){
                return new int[]{sumMap.get(diff),i};
            }
            sumMap.put(nums[i],i);
        }
        return new int[]{};
        
    }
}