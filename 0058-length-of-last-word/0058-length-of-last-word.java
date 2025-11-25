class Solution {
    public int lengthOfLastWord(String s) {
        String ans = s.trim();

        String[] sArr= s.split(" ");
        
        return sArr[sArr.length-1].length();
            }
}