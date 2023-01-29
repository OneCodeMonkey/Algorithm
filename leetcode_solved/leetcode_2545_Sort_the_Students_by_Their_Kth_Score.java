// AC: Runtime 2 ms Beats 95.36% 
// Memory 52.4 MB Beats 80.65%
// .
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> (b[k] - a[k]));
        return score;
    }
}
