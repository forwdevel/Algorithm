import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                temp.add(arr[i]);
            }
        }
        
        if(temp.size() == 0){
            int[] ans = {-1};
            return ans;
        }

        Collections.sort(temp);
        
        int[] answer = new int[temp.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = temp.get(i);
        }
            
        return answer;
    }
}