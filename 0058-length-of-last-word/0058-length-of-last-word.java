class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        String[] result = s.split(" ");
        return result[result.length-1].length();
    }
}