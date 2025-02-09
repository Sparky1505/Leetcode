class Solution {
    public boolean isPalindrome(int x) {

       int original =x;
       int rev=0;


       if(x<0){
        return false;
       }


       while(original!=0){
        int rem = original%10;
        original/=10;
        rev=rev*10+rem;
       }

       if(rev == x){
        return true;
       }
       return false;
    }
}