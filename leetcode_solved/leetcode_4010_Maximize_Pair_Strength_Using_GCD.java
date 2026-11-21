// Solution 2: 去重 + 排序 + 剪枝
// Runtime 278 ms Beats 99.46% 
// Memory 47.30 MB Beats 6.10%
// T:O(n^2 * log(max(ni))), S:O(n)
//
class Solution {
    public long maxPairStrength(int[] nums) {
        long ret = 1;
        // 对 nums 去重，然后 sort
        Set<Integer> removeDupSet = new HashSet<>();
        for (int i : nums) {
            removeDupSet.add(i);
        }
        if (removeDupSet.size() == 1) {
            return ret;
        }
        List<Integer> sortList = new ArrayList<>(removeDupSet);
        sortList.sort(Comparator.reverseOrder());

        int len = sortList.size();
        // 从大到小遍历
        for (int i = 0; i < len - 1; i++) {
            // 剪枝:
            if (i + 1 < len && (long) sortList.get(i) * sortList.get(i + 1) <= ret) {
                break;
            }

            for (int j = i + 1; j < len; j++) {
                int gcd = getGcd(sortList.get(i), sortList.get(j));
                long ans = (long) sortList.get(i) * sortList.get(j) / gcd / gcd;
                if (ans > ret) {
                    ret = ans;
                }
            }
        }

        return ret;
    }

    private int getGcd(int a, int b) {
        if (a > b) {
            return getGcd(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return getGcd(b % a, a);
    }
}


// Solution 1: 暴力，n 较小时可以过
// Runtime 1066 ms Beats 12.92% 
// Memory 47.00 MB Beats 58.80%
// Brute-force.
// T:O(n^2 * logn)
// 
class Solution {
    public long maxPairStrength(int[] nums) {
        long ret = 0;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int gcd = getGcd(nums[i], nums[j]);
                long ans = (long) nums[i] * nums[j] / gcd / gcd;
                if (ans > ret) {
                    ret = ans;
                }
            }
        }

        return ret;
    }

    private int getGcd(int a, int b) {
        if (a > b) {
            return getGcd(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return getGcd(b % a, a);
    }
}
