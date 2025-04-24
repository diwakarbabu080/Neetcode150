class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        if(bills[0] != 5){
            return false;
        }
        
        int fives = 0, tens = 0, twenties = 0;
        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                fives++;
            }else if(bills[i] == 10 && fives>0){
               tens++;
               fives--;
            }else if(bills[i] == 20){
                
                if(fives >= 1 && tens> 0){
                    fives--;
                    tens--;
                    twenties++;
                }
                else if(fives>2){
                     
                     fives -= 3;
                     twenties++;
                }else{
                    return false;
                }
                
                
            }   
            else{
                return false;
            }
        }
        return true;
    }
}