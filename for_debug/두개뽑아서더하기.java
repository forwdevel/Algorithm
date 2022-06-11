import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j != i && j < numbers.length; j++) {
                temp.add(numbers[i] + numbers[j]);
            }
        }
        
        Set<Integer> set = new LinkedHashSet<>();
        
        set.addAll(temp);
        temp.clear();
        temp.addAll(set);

        Collections.sort(temp);
        
        int[] answer = new int[temp.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = temp.get(i);
        }

        return answer;
    }
}