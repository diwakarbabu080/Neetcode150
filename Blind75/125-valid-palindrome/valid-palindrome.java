class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        for(char ch : s.toCharArray()){
            if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')||('0'<= ch && ch<= '9')) {
                if('A' <= ch && ch <= 'Z'){
                    ch = (char)(ch+32);
                }
                str+=ch;
            }
        }
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