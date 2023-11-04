// AC: Runtime Details 3ms Beats 100.00%of users with Java
// Memory Details 42.40MB Beats 100.00%of users with Java
// .
// T:O(logn * n), S:O(1)
// 
class Solution {
    public int findKOr(int[] nums, int k) {
        int ret = 0, base = 1;
        for (int i = 0; i < 32; i++) {
            int count = 0, base2 = base << i;
            boolean hasSmaller = false;
            for (int num : nums) {
                if ((num & base2) == base2) {
                    count++;
                }
                if (!hasSmaller && num >= base2) {
                    hasSmaller = true;
                }
            }
            if (!hasSmaller) {
                break;
            }
            if (count >= k) {
                ret += base2;
            }
        }

        return ret;
    }
}
