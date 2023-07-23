// AC: 40ms Beats 20.00%of users with Java
// Memory: 59.12mb Beats 20.00%of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int len = nums.size(), freqN = -1, freqNCount = 0, ret = -1;
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
            if (freqN == -1 && 2 * count.get(num) > len) {
                freqN = num;
            }
        }
        if (freqN == -1) {
            for (int key : count.keySet()) {
                if (2 * count.get(key) > len) {
                    freqN = key;
                    break;
                }
            }
        }
        freqNCount = count.get(freqN);
        if (2 * count.get(freqN) - len >= 2) {
            int curCount = 0;
            for (int i = 0; i < len; i++) {
                if (nums.get(i) == freqN) {
                    curCount++;
                    if (2 * curCount - i - 1 >= 1 && 2 * (freqNCount - curCount) - (len - i - 1) >= 1) {
                        ret = i;
                        break;
                    }
                }
            }
        }

        return ret;
    }
}
