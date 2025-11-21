class Solution {
    public int[] shuffle(int[] nums, int n) {



        int index=0;
        int[] ans = new int[nums.length];
        for(int i =0;i<n;i++){
            ans[index]=nums[i];
            index+=2;
        }
        int index1=1;
        for(int i =n;i<nums.length;i++){
            ans[index1]=nums[i];
            index1+=2;
        }

        return ans;

        
        
    }
}