class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int m = n/2;
       int maxCount=0;
       int result=-1;

       HashMap<Integer,Integer> map1= new HashMap<>();
       for(int i =0;i<n;i++){
        int num = nums[i];
        map1.put(num,map1.getOrDefault(num,0)+1);
       }
       for(int num: map1.keySet()){
        int count = map1.get(num);
        if(count>maxCount){
            maxCount=count;
            result=num;
        }
       }

       

       return result;
        
    }
}