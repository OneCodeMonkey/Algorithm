// Time: Runtime 3 ms Beats 22.22% 
// Memory 40.2 MB Beats 55.56%
// brute-force
// T:O(n), S:O(1)
// 
class Solution {
    public int pivotInteger(int n) {
        int ret = -1, sumN = n * (n + 1) / 2, curSum = 0;
        for (int i = 1; i <= n; i++) {
            curSum += i;
            if (curSum > (sumN + i) / 2) {
                break;
            }
            if ((sumN + i) % 2 == 0 && curSum * 2 == (sumN + i)) {
                ret = i;
                break;
            }
        }

        return ret;
    }
}
