// Runtime 18 ms Beats 50.00% of users with Java
// Memory 81.02 MB Beats 100.00% of users with Java
// HashSet & sort.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        int ret = 0;
        HashSet<Integer> xPosRecord = new HashSet<>();
        for (int[] point : points) {
            xPosRecord.add(point[0]);
        }
        if (w == 0) {
            return xPosRecord.size();
        }
        int len = xPosRecord.size(), pos = 0, curStart = -1;
        int[] arr = new int[len];
        for (int i : xPosRecord) {
            arr[pos++] = i;
        }
        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            if (curStart == -1) {
                curStart = arr[i];
                ret++;
            } else {
                if (arr[i] > curStart + w) {
                    curStart = arr[i];
                    ret++;
                }
            }
        }

        return ret;
    }
}
