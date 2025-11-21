class Solution {
    public int largestAltitude(int[] gain) {


        int max =0;
        int start=0;


        int i =0;
        int sum=0;
        while(i<gain.length){
            sum+=gain[i];
            
            if(sum>=max){
                max=sum;
                
            }
            i++;
        }

        return max;
        
    }
}