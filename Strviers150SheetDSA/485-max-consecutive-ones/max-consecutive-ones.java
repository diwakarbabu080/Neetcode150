class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        

        int res = 0;
        int Maxcount = 0;
        int count = 0;

        for(int i = 0; i< arr.length; i++){
          
            if(arr[i] ==1){
                count++;
            }
            else{
                
                count = 0;
            }
              Maxcount = Math.max(Maxcount,count );
        }

        //  Maxcount = Math.max(Maxcount,count );

         return Maxcount;
    }
}