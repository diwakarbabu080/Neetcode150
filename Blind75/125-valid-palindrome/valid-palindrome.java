class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) >='A' && s.charAt(i) <='Z'){
                ans.append((char)(s.charAt(i)+32));
            }
            else if(s.charAt(i) >='a' && s.charAt(i) <='z' || (s.charAt(i) >='0' && s.charAt(i) <='9')){
                ans.append(s.charAt(i));
            }
        }
        str = ans.toString();
        // System.out.println(s+" "+str);
        // boolean ans = true;
        int start = 0; 
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
