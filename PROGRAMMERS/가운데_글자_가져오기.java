class Solution {
    public String solution(String s) {
        int idx = 0;
        
        if(s.length() % 2 == 0){
            idx = s.length() / 2 - 1;
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
    }
}