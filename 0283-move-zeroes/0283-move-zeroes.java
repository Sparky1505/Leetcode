class Solution {
    public void moveZeroes(int[] nums) {
    //   int first =0;
    //   int second=1;
    //   while(second<nums.length){
    //     if(nums[first]==0){
    //         int temp= nums[first];
    //         nums[first]=nums[second];
    //         nums[second]=temp;
    //         first++;
    //         second++;

    //     }
    //   }

    // above -> tried with swap but won't when it has more than one 0

    // int[] res = new int[nums.length];
    // int index=0;
    // for(int i =0;i<nums.length;i++){
    
    //     if(nums[i]>0){
    //         res[index]=nums[i];
    //         index++;
    //     }
    // }
    // for(int i=0;i<nums.length;i++){
    //     nums[i]=res[i];
    // }

    // above -> works with hint 1, tried with additional array then reassigning the value back


    int i=0;
    int index=0;
    int count=0;
    while(i<nums.length){
        if(nums[i]==0){
            count++;
        }
        if(nums[i]!=0){
            nums[index]= nums[i];
            index++;
        }
        
        i++;
        
    }
    int zerolen= nums.length-count;
    while(zerolen<nums.length){
        nums[zerolen]=0;
        zerolen++;
    }
   
    




    }
}