// AC: 1ms Beats 100.00%of users with Java
// Memory: 43.78MB Beats 50.00%of users with Java
// .
// T:O(n * logk), S:O(1)
// 
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ret = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (countBit(i) == k) {
                ret += nums.get(i);
            }
        }

        return ret;
    }

    private int countBit(int num) {
        int ret = 0;
        while (num > 0) {
            ret += num % 2;
            num >>= 1;
        }

        return ret;
    }
}
