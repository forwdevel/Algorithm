class Solution {
    public int[] solution(int n, int m) {
        int gcd = 0, lcm = 0;
        if(m == 0) {
            gcd = n;
        } else {
            solution(m, n % m);
        }
        
        lcm = first_n * first_m / gcd;
    }
}