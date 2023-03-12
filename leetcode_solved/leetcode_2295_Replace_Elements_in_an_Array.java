// AC: Runtime 65 ms Beats 25.16% 
// Memory 93.3 MB Beats 60.87%
// Hashmap, using two reflection.
// T:O(m + n), S:O(n), m = nums.length, n = operatiojs.length
//
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> mapping = new HashMap<>(), reverseMapping = new HashMap<>();
        for (int[] operation : operations) {
            int from = operation[0], to = operation[1];
            if (reverseMapping.containsKey(from)) {
                int source = reverseMapping.get(from);
                mapping.put(source, to);
                reverseMapping.remove(from);
                reverseMapping.put(to, source);
            } else {
                mapping.put(from, to);
                reverseMapping.put(to, from);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (mapping.containsKey(nums[i])) {
                nums[i] = mapping.get(nums[i]);
            }
        }

        return nums;
    }
}
