// AC: Runtime: 2 ms, faster than 67.59% of Java online submissions for Maximize Sum Of Array After K Negations.
// Memory Usage: 38.4 MB, less than 64.18% of Java online submissions for Maximize Sum Of Array After K Negations.
// thought: analyze by different cases.
// T:O(n), S:o(1)
//
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int negaCount = 0, posiCount = 0, ret = 0, size = nums.length;
        int largestNega = Integer.MIN_VALUE, leastPosi = Integer.MAX_VALUE;
        boolean hasZero = false;

        for (int i: nums) {
            if (i == 0 && !hasZero) {
                hasZero = true;
            }
            if (i < 0) {
                negaCount++;
                largestNega = Math.max(largestNega, i);
            }
            if (i > 0) {
                posiCount++;
                leastPosi = Math.min(leastPosi, i);
            }
        }

        if (negaCount >= k) {
            for (int i: nums) {
                if (i < 0 && k > 0) {
                    ret += -i;
                    k--;
                } else {
                    ret += i;
                }
            }
        } else {
            if (hasZero) {
                for (int i: nums) {
                    if (i < 0) {
                        ret += -i;
                    } else {
                        ret += i;
                    }
                }
            } else {
                for (int i: nums) {
                    if (i < 0) {
                        ret += -i;
                    } else {
                        ret += i;
                    }
                }
                if ((k - negaCount) % 2 == 1) {
                    if (largestNega != Integer.MIN_VALUE) {
                        ret -= 2 * Math.min(-largestNega, leastPosi);
                    } else {
                        ret -= 2 * leastPosi;
                    }
                }
            }
        }

        return ret;
    }
}