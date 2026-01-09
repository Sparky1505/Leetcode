class Solution {
    public boolean validPalindrome(String s) {

        
        int len = s.length();

        int left=0;
        int right = len-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return isPali(s,left+1,right) || isPali(s,left,right-1);
            }
        }
        return true;

      
}

public boolean isPali(String s, int left, int right){

  
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}