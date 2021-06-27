// AC: Runtime: 4 ms, faster than 88.46% of Java online submissions for Partitioning Into Minimum Number Of Deci-Binary Numbers.
// Memory Usage: 40 MB, less than 13.36% of Java online submissions for Partitioning Into Minimum Number Of Deci-Binary Numbers.
// see some example, we see that answer is the max bit.(We can prove, but there may not cost such a time)
// T:O(n), S:O(1)
// 
class Solution {
    public int minPartitions(String n) {
        int size = n.length();
        char maxChar = '0';
        for (int i = 0; i < size; i++) {
            if (n.charAt(i) > maxChar) {
                maxChar = n.charAt(i);
            }
        }

        return Integer.parseInt(String.valueOf(maxChar));
    }
}