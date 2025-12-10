class Solution {
    public boolean isAnagram(String s, String t) {

        int slen= s.length();
        int tlen= t.length();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);



        
    }
}