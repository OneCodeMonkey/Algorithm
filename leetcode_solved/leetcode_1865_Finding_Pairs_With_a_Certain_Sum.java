// Runtime 129 ms Beats 97.19% 
// Memory 75.10 MB Beats 50.18%
// Map.
// T:O(n), S:O(n)
// 
class FindSumPairs {
    HashMap<Integer, Integer> record1 = new HashMap<>(), record2 = new HashMap<>();
    int[] num1, num2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        num1 = nums1;
        num2 = nums2;
        for (int i : nums1) {
            record1.merge(i, 1, Integer::sum);
        }
        for (int i : nums2) {
            record2.merge(i, 1, Integer::sum);
        }
    }

    public void add(int index, int val) {
        int original = num2[index], newVal = original + val;
        if (record2.get(original) == 1) {
            record2.remove(original);
        } else {
            record2.merge(original, -1, Integer::sum);
        }
        record2.merge(newVal, 1, Integer::sum);
        num2[index] = newVal;
    }

    public int count(int tot) {
        int ret = 0;
        for (int i : record1.keySet()) {
            if (i >= tot) {
                continue;
            }
            if (record2.containsKey(tot - i)) {
                ret += record1.get(i) * record2.get(tot - i);
            }
        }

        return ret;
    }
}
