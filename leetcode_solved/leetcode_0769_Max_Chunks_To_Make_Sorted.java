// AC: Runtime 1 ms Beats 100% 
// Memory 40 MB Beats 61.65%
// sort and compare
// T:O(n ^ 2), S:O(n)
// 
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int len = arr.length, ret = 0;
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set1.add(i);
            set2.add(arr[i]);
            if (set1.equals(set2)) {
                ret++;
            }
        }

        return ret;
    }
}
