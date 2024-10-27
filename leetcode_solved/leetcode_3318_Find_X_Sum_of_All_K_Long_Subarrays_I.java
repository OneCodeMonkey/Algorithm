// Runtime 17 ms Beats 19.09%
// Memory 45.83 MB Beats 6.72%
// Hashmap & sort.
// T:O(n * k), S:O(k)
// 
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int len = nums.length, pos = 0;
        int[] ret = new int[len - k + 1];
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < len; i++) {
            record.merge(nums[i], 1, Integer::sum);
            if (i < k - 1) {
                continue;
            }
            int sum = 0, countX = x;
            TreeMap<Integer, List<Integer>> sort = new TreeMap<>(Comparator.reverseOrder());
            for (int key : record.keySet()) {
                int freq = record.get(key);
                if (sort.containsKey(freq)) {
                    sort.get(freq).add(key);
                } else {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(key);
                    sort.put(freq, list1);
                }
            }
            for (int freq : sort.keySet()) {
                List<Integer> elems = sort.get(freq);
                if (elems.size() <= countX) {
                    for (int elem : elems) {
                        sum += elem * freq;
                    }
                    countX -= elems.size();
                } else {
                    elems.sort(Collections.reverseOrder());
                    for (int j = 0; j < countX; j++) {
                        sum += elems.get(j) * freq;
                    }
                    countX = 0;
                }

                if (countX == 0) {
                    break;
                }
            }

            record.merge(nums[i + 1 - k], -1, Integer::sum);
            ret[pos++] = sum;
        }

        return ret;
    }
}
