
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int first = 0;
        int second = 0;
        while(first<players.length && second<trainers.length){

            if(players[first] <= trainers[second]){
                first++;
               
            }
            second++;
           
            
        }
        return first;

        
    }
}