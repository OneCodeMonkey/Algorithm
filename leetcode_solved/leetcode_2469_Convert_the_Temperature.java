// Runtime 0 ms Beats 100% 
// Memory 42.5 MB Beats 33.33%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ret = new double[2];
        ret[0] = celsius + 273.15000;
        ret[1] = celsius * 1.8 + 32.00000;

        return ret;
    }
}