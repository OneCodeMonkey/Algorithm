// AC: Runtime 0 ms Beats 100% 
// Memory 38.9 MB Beats 94.38%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0, curSign = 1, firstDigitSign = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += curSign == 1 ? digit : -digit;
            firstDigitSign = curSign;
            curSign = curSign == 1 ? -1 : 1;
            n /= 10;
        }

        return firstDigitSign == 1 ? sum : -sum;
    }
}
