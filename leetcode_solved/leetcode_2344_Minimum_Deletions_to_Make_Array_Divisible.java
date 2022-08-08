// AC: Runtime: 15 ms, faster than 73.15% of Java online submissions for Minimum Deletions to Make Array Divisible.
// Memory Usage: 83 MB, less than 37.11% of Java online submissions for Minimum Deletions to Make Array Divisible.
// first find the greatest common divider of numsDivide, 
// and then find the minimum of nums that (GCD % nums[i] == 0), if not, return -1
// T:O(nlogn + mlogm), S:O(logn)
// 
class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        // 1.first: get GCD of numsDivide[]
        int gcd = numsDivide[0];
        if (numsDivide.length > 1) {
            for (int i = 0; i + 1 < numsDivide.length; i++) {
                gcd = getGDC(gcd, numsDivide[i + 1]);
                if (gcd == 1) {
                    break;
                }
            }
        }
        Arrays.sort(nums);
        int ret = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > gcd) {
                return ret;
            }
            if (gcd % nums[i] == 0) {
                return i;
            }
        }

        return ret;
    }

    private int getGDC(int a, int b) {
        if (a < 1 || b < 1) {
            return -1;
        }
        if (a < b) {
            return getGDC(b, a);
        }
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return b;
    }
}