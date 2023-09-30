// AC: Runtime 103 ms Beats 11.54% 
// Memory 56.9 MB Beats 76.44%
// Hashmap.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> mapping = new HashMap<>();
        for (int num : nums) {
            int digitSum = digitSum(num);
            if (mapping.containsKey(digitSum)) {
                mapping.get(digitSum).add(num);
            } else {
                List<Integer> tmpList = new LinkedList<>();
                tmpList.add(num);
                mapping.put(digitSum, tmpList);
            }
        }
        int ret = -1;
        for (int key : mapping.keySet()) {
            List<Integer> tmpList = mapping.get(key);
            if (tmpList.size() > 1) {
                Collections.sort(tmpList);
                ret = Math.max(ret, tmpList.get(tmpList.size() - 2) + tmpList.get(tmpList.size() - 1));
            }
        }

        return ret;
    }

    private int digitSum(int n) {
        int ret = 0;
        while (n > 0) {
            ret += n % 10;
            n /= 10;
        }

        return ret;
    }
}