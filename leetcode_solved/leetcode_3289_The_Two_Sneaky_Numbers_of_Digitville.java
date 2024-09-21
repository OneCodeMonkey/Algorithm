// Runtime 3 ms Beats 100.00%
// Memory 44.90 MB Beats 100.00%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ret = new LinkedList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums) {
            if (!set1.add(num)) {
                ret.add(num);
            }
        }
        int[] retArr = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            retArr[i] = ret.get(i);
        }

        return retArr;
    }
}
