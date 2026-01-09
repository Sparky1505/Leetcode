class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        int[] ans = new int[2];

        int left=0;
        int right =n-1;
        while(left<right){

            int sum = numbers[left]+numbers[right];
            if(target==sum){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return ans;
        
    }
}