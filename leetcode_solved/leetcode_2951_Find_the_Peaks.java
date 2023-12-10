// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 44.20 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                ret.add(i);
            }
        }

        return ret;
    }
}
