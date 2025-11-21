class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {



            ArrayList<Integer> list1 = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                list1.add(index[i],nums[i]);
            }

           // System.out.println(list1);
           int[] target = new int[nums.length];
           for(int i =0;i<nums.length;i++){
            target[i]= list1.get(i);
           }
            return target;
    }
}