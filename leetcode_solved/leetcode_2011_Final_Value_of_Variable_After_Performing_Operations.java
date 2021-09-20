// AC: Runtime: 1 ms, faster than 83.33% of Java online submissions for Final Value of Variable After Performing Operations.
// Memory Usage: 38.3 MB, less than 83.33% of Java online submissions for Final Value of Variable After Performing Operations.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ret = 0;
        for (String str: operations) {
            if (str.contains("++")) {
                ret++;
            } else {
                ret--;
            }
        }

        return ret;
    }
}