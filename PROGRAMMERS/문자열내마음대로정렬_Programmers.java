import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new CompareNthChar(n));

        int cnt_dup = 0;
        int idx_start = 0;
        boolean isDup = false;

        List<String> temp = new ArrayList<String>();

        // Check Duplicates
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].charAt(n) == strings[i - 1].charAt(n)) {

                if (!isDup) {
                    isDup = true;
                    idx_start = i - 1;
                }

                // Dulpicates
                temp.add(strings[i - 1]);
                temp.add(strings[i]);
                cnt_dup += 2;

            } else {
                if (isDup && temp.size() != 0) {
                    // Remove Duplicates in temp
                    Set<String> set = new LinkedHashSet<>();
                    set.addAll(temp);
                    temp.clear();
                    temp.addAll(set);

                    // Sort
                    Collections.sort(temp, new CompareString());

                    for (int j = 0; j < cnt_dup; j++) {
                        // Paste
                        strings[j + idx_start] = temp.get(0);
                        // Remove temp
                        temp.remove(0);
                    }

                    // Initailize
                    cnt_dup = 0;
                    isDup = false;
                    idx_start = 0;
                }
            }
        }
        return strings;
    }
}

class CompareString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}

class CompareNthChar implements Comparator<String> {
    int n;

    CompareNthChar(int n) {
        this.n = n;
    }

    @Override
    public int compare(String o1, String o2) {
        int sub = o1.charAt(n) - o2.charAt(n);

        if (sub > 0) {
            return 1;
        }
        if (sub < 0) {
            return -1;
        }

        return 0;
    }

}