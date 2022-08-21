// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Number of Groups Entering a Competition.
// Memory Usage: 50.2 MB, less than 98.27% of Java online submissions for Maximum Number of Groups Entering a Competition.
// the greedy way is sorting the array, group them in order, find the max group count N that N * (N+1) / 2 >= num
// T:O(1), S:O(1)
// 
class Solution {
    public int maximumGroups(int[] grades) {
        int len = grades.length, sqrtN = (int) Math.sqrt(len * 2.0), total = sqrtN * (sqrtN + 1) / 2;
        if (total <= len) {
            return sqrtN;
        } else {
            return sqrtN - 1;
        }
    }
}