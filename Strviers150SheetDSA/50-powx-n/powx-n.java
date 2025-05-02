class Solution {
    public double myPow(double x, int n) {

        // reson why we are using long is because if we just convert int min to max it will overflow that is reason we are using long.

        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
                power = power - 1;
            } else {
                x = x * x;
                power = power / 2;
            }

        }
        return result;

    }
}