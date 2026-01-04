class Solution {
    public int sumFourDivisors(int[] nums) {

        int n = nums.length;

     
       int result=0;
         for(int i =0;i<n;i++){
            int sum =0;
            int count=0;
            for(int j =1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    int num1 = j;
                    int num2 = nums[i]/j;
                    if(num1==num2){
                        count++;
                    }else{
                        sum+=num1+num2;
                        count+=2;
                    }
                    if(count>4){
                        break;
                    }
                }
                
            }
            if(count==4){
                   result+=sum;
                }
        }
        return result;
    }
}