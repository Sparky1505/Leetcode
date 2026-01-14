class Solution {
    public boolean containsDuplicate(int[] nums) {

       	int n = nums.length;
		
		
		HashSet<Integer> set1= new HashSet<>();
		for(int i =0;i<n;i++) {
			int num = nums[i];
			if(set1.contains(num)) {
				return true;
			}
			set1.add(num);
		}

		return false;

        
    }
}