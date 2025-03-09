// Runtime 0 ms Beats 100.00% 
// Memory 40.24 MB Beats 93.37%
// N 进制的理解：从3进制的角度去理解，如果某一位置为 2， 则3^k 必然出现2次，那么不符合题目条件所述。
// T:O(logn), S:O(1)
// 
class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }

        return true;
    }
}
