class Solution {
    public int romanToInt(String s) {

        int len = s.length();
        int res=0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        map1.put('I',1);
        map1.put('V',5);
        map1.put('X',10);
        map1.put('L',50);
        map1.put('C',100);
        map1.put('D',500);
        map1.put('M',1000);

        for(int i =0;i<len-1;i++){
            int first = map1.get(s.charAt(i));
            int second = map1.get(s.charAt(i+1));

            if(first<second){
                res-=map1.get(s.charAt(i));
            }else{
                res+=map1.get(s.charAt(i));
            }
        }
        return res + map1.get(s.charAt(len-1));


        
    }
}