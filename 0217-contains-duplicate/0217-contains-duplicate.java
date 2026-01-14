class Solution {
    public boolean containsDuplicate(int[] nums) {

       	int n = nums.length;
		
		
		HashSet<Integer> set1= new HashSet<>();
		for(int i =0;i<n;i++) {
			int num = nums[i];
			set1.add(num);
		}
		if(n!=set1.size()) {
			return true;
		}

		return false;

        
    }
}