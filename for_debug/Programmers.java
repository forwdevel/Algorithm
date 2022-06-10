import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String s) {
        ArrayList<Character> lower = new ArrayList<Character>();
        ArrayList<Character> upper = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a') { // 'a' = 97, 'z' = 122, 'A' = 65, 'Z' = 90
                // upper
                upper.add(s.charAt(i));
            } else {
                // lower
                lower.add(s.charAt(i));
            }
        }

        lower.sort(Comparator.reverseOrder());
        upper.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (Character ch : lower) {
            sb.append(ch);
        }

        for (Character ch : upper) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));

    }
}