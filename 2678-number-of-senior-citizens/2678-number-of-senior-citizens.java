class Solution {
    public int countSeniors(String[] details) {

               int count=0;

       for(int i=0;i<details.length;i++){


        String num = details[i];
        String num1= num.charAt(11)+""+num.charAt(12);

        int res = Integer.parseInt(num1);
        if(res>60){
            count++;
          

        }
       }
        return count;
    }
}