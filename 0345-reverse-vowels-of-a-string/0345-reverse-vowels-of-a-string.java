class Solution {
    public String reverseVowels(String s) {
        
        int len = s.length();


        char[] sChar = s.toCharArray();
        int n = sChar.length;
            int left =0;
            int right = n-1;

        while(left<right){
            if("aeiouAEIOU".indexOf(sChar[left])==-1){
                left++;
                continue;

            }

            if("aeiouAEIOU".indexOf(sChar[right])==-1){
                right--;
                continue;
            }

            char temp = sChar[left];
            sChar[left]=sChar[right];
            sChar[right]=temp;
            left++;
            right--;
        }
        return new String(sChar);

        
    }
}