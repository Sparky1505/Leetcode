class Solution {
    public boolean isPalindrome(String s) {

        

      

        String newStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len = newStr.length();
          if(len<2){
            return true;
        }

        String str1= newStr;

        String rev="";
        for(int i =str1.length()-1;i>=0;i--){
            rev+=str1.charAt(i);
        }

        
        if(str1.matches(rev)){
            return true;
        }
        return false;
    }
}