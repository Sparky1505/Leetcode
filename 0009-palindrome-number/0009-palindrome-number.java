class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        String xString = String.valueOf(x);
        int n = xString.length();


        int left =0;
        int right =n-1;
        while(left<right){
            if(xString.charAt(left)!=xString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}