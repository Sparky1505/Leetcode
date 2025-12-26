class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        List<Integer> list1= new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){

                    if(!list1.contains(nums1[i])){
                    list1.add(nums1[i]);
                }
                }
            }
        }

        int[] result = new int[list1.size()];
        for(int i =0;i<list1.size();i++){
            result[i]= list1.get(i);
        }
        return result;


        
    }
}