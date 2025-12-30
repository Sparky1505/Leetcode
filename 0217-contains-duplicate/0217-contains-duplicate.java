class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            int num = nums[i];

          
                map.put(num,map.getOrDefault(num,0)+1);
            

        }

        for(int num: map.values()){
            if(num>1){
                return true;
            }
        }
        return false;


        
    }
}