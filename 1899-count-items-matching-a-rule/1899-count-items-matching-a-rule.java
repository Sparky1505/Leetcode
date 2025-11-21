class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {



        int count=0;
        for(int i =0;i<items.size();i++)
        {
            List<String> row = items.get(i);
           if(ruleKey.equals("type")&&ruleValue.equals(row.get(0))){
            count++;
           }else if(ruleKey.equals("color")&&ruleValue.equals(row.get(1))){
            count++;
           }else if(ruleKey.equals("name")&&ruleValue.equals(row.get(2))){
            count++;
           }
        }
        return count;
        
    }
}