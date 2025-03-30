class Solution {
    public int hammingWeight(int n) {

        int count = 1;
        while((n&(n-1)) != 0){

            n = n&(n-1);
            count++;

        }
       return count;
    }
}