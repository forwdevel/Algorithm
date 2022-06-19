// For Algorithm submit template

class Main {
    public static String longestCommonPrefix(String[] strs) {
        String answer = strs[0];

        int strs_size = strs.length;

        if (answer.length() == 0) {
            return "";
        }

        for (int i = 0; i < strs_size - 1; i++) {
            System.out.println(strs[i].charAt(0) + " = " + strs[i + 1].charAt(0) + " ? ");
            if (strs[i].charAt(0) != strs[i + 1].charAt(0)) {
                return "";
            }
            for (int j = 1; j < answer.length() && j < strs[i].length() && j < strs[i + 1].length(); j++) {
                // 0 idx is already checkedd

                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    answer = answer.substring(0, j);
                    break;
                }
            }
            if (answer.length() > strs[i].length()) {
                answer = answer.substring(0, strs[i].length());
            }
            if (answer.length() > strs[i + 1].length()) {
                answer = answer.substring(0, strs[i + 1].length());
            }
        }

        try {
            
        } catch (IndexOutOfBoundsException e) {
            //TODO: handle exception
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] strs = { "aaa", "aa", "aaa" };
        System.out.println(longestCommonPrefix(strs));
    }
}