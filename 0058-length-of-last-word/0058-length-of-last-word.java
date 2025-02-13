class Solution {
    public int lengthOfLastWord(String s) {


        String ans = s.trim();

        String[] finans = ans.split(" ");
        int n = finans.length;

        return finans[n-1].length();
    }
}