// AC: Runtime 25 ms Beats 20% 
// Memory 54.4 MB Beats 20%
// hashset & sort
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        List<Integer> pairs = new ArrayList<>();
        for (int i : nums) {
            if ((i > 0 && record.contains(-i)) || (i < 0 && record.contains(-i))) {
                pairs.add(Math.abs(i));
            }
            record.add(i);
        }
        if (pairs.isEmpty()) {
            return -1;
        }
        Collections.sort(pairs);

        return pairs.get(pairs.size() - 1);
    }
}
