class Solution {
    public int removeDuplicates(int[] nums) {


        int n = nums.length;

        int index=0;

        List<Integer> list1 = new ArrayList();
        for(int i =0;i<n;i++){
            int count =0;
            for(int j =i;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count<=2){
                list1.add(nums[i]);
            }

            
            
        }
         int[] finans = new int[list1.size()];
        for(int i=0;i<finans.length;i++){
            finans[i]= list1.get(i);
        }
        
        for(int i=0;i<finans.length;i++){
            nums[i] = finans[i];
        }
        return finans.length;
    }
}