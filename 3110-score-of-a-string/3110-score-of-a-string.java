class Solution {
    public int scoreOfString(String s) {


        int n = s.length();
        int sum=0;
        for(int i =1;i<n;i++){
            char c1= s.charAt(i);
            char c2= s.charAt(i-1);

            int c1num= (int) c1;
            int c2num = (int) c2;

            int diff = Math.abs(c1num-c2num);
            

            sum+=diff;





                    }


                    return sum;
        
    }
}