class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '['||s.charAt(i) == '('||s.charAt(i) == '{' ){
                stack.push(s.charAt(i));
            }else{
                if(stack.size() == 0){
                    return false;
                }else{
                    char ch = stack.pop();
                    boolean check = checkCase(ch, s.charAt(i));
                    if(check == false){
                        return false;
                    }
                }
            }
        }
        if(stack.size()!= 0)return false;
        return true;


        
    }
    public boolean checkCase(char a, char b){
        if(a == '('){
            if(b == ')'){
                return true;
            }else{
                return false;
            }
        }
        if(a == '['){
            if(b == ']'){
                return true;
            }else{
                return false;
            }
        }
        if(a == '{'){
            if(b == '}'){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}