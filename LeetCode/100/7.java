class Solution {
    public int reverse(int x) {
        long result = 0;
        int sign = 0;

        if (x > 0) {
            // positive
            sign = 1;
        } else if (x < 0) {
            // negative
            x = x * -1;
            sign = -1;
        } else {
            // zero
            return 0;
        }

        while (x != 0) {
            result += (long) x % 10;
            x /= 10;
            if (x == 0) {
                break;
            }
            result *= (long) 10;
            if (result > 2147483647 || result < -2147483648) {
                return 0;
            }
        }

        result = result * sign;

        return (int) result;
    }
}