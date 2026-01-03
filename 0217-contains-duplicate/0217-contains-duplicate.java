class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;
        HashSet<Integer> numbers = new HashSet<>();
        for(int i =0;i<n;i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
     
        return false;


        
    }
}