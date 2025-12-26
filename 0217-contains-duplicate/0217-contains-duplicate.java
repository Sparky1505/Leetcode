class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map1 = new HashMap<>();
        int count=0;
        for(int i =0;i<n;i++){
            int num = nums[i];
            map1.put(num,map1.getOrDefault(num,0)+1);
        }

        for(int num: map1.values()){
            if(num>1){
                return true;
            }
        }
        return false;
        
    }
}