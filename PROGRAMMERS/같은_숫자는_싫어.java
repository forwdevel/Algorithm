import java.util.*;

class Solution {
    public static int[] solution(int []arr) {

        for (int i : arr) {
            temp.add(arr[i]);
        }
        System.out.println("arr size : "+arr.length);
        System.out.println("temp (arr copy) size : "+temp.size());

        Set<Integer> set = new LinkedHashSet<>();

        set.addAll(temp);
        System.out.println("set size : "+set.size());
        temp.clear();
        temp.addAll(set);
        System.out.println("temp (after set) size : "+temp.size());

        int[] answer = new int[temp.size()];

        for (int i : answer) {
            answer[i] = temp.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        solution(arr);

        switch (key) {
            case value:
                
                break;
        
            default:
                break;
        }
    }
}