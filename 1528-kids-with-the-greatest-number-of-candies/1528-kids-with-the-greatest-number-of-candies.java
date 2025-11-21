class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    
        int max= candies[0];
        for(int i=1;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }

        ArrayList<Boolean> result = new ArrayList<>();


        for(int i =0;i<candies.length;i++){
            candies[i]+=extraCandies;
            if(candies[i]>=max){
               result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
        
    }
}