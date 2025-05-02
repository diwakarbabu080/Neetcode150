class Solution {
    public int myAtoi(String s) {

        int INT_MIN = Integer.MIN_VALUE; // -2_147_483_648
        int INT_MAX = Integer.MAX_VALUE; // 2_147_483_647

        int ans = 0;
        int n = s.length();
        boolean isNegative = false;
        
        int i = 0;

        while(i<n&& s.charAt(i) == ' ')i++;

        
        if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            isNegative = s.charAt(i) == '-';
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){

            
            int val = (int) (s.charAt(i) - '0');

            if(ans>(INT_MAX-val)/10){
                return isNegative? INT_MIN:INT_MAX;
            }
            ans = ans*10+val;
            i++;
            
        }

        return isNegative?  -1 * ans: ans;

    }
}