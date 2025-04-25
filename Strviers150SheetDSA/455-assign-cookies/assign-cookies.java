class Solution {
    public int findContentChildren(int[] greed, int[] cookies) {

        Arrays.sort(greed);
         Arrays.sort(cookies);

        int first = 0;
        int second = 0;

        while(first<greed.length && second<cookies.length){
            if(greed[first]<= cookies[second]){
                first++;
            }
            second++;
        }
        return first;
        
    }
}