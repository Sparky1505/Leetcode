class Solution {
    public int[][] flipAndInvertImage(int[][] image) {



        colSwap(image);

        invertZeros(image);

        
           return image;
        }


         static void colSwap(int[][] image){
          for(int i=0;i<image.length;i++){
            int start=0;
            int end=image[i].length-1;
            while(start<end){
                int temp= image[i][start];
                image[i][start]= image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
           }
         }
         static void invertZeros(int[][] flipZeros) {
		 
		for(int[] i: flipZeros){

            for(int j=0;j<i.length;j++){
                int val = i[j];
                if(val==0){
                    i[j]=1;
                }else{
                    i[j]=0;
                }
            }

        }
		 
	 }


}