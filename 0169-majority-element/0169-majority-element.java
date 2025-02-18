class Solution {
    public int majorityElement(int[] nums) {


       int n = nums.length;
       int m = n/2;
       HashMap<Integer,Integer> map1 = new HashMap<>();

       for(int i =0;i<n;i++){
        int first = nums[i];
        map1.put(first,map1.getOrDefault(first,0)+1);
       }
        
        Object[] key= map1.keySet().toArray();
       // int ans=0;
        for(int i =0;i<key.length;i++){
            Integer ans = (Integer) key[i];

            if(map1.get(ans)>m){
                return ans;
            }
        }
        return 0;
    }
}