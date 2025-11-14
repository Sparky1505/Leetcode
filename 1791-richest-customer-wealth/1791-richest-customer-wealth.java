class Solution {
    public int maximumWealth(int[][] accounts) {

       int max = Integer.MIN_VALUE;
        int rowsum=0;
        

        for(int i=0;i<accounts.length;i++){
            int rowmax=0;
            for(int j=0;j<accounts[i].length;j++){
                rowmax+=accounts[i][j];

                if(rowmax>rowsum){
                    max=rowmax;
                    rowsum=rowmax;
                }
            }
                
        }
        return max;
        
    }
}