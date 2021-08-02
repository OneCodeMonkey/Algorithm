// AC: Runtime: 4 ms, faster than 53.38% of Java online submissions for Lexicographical Numbers.
// Memory Usage: 46.1 MB, less than 23.86% of Java online submissions for Lexicographical Numbers.
// first *10 and judge not over n, else try +=1, else forwarding when last bit is 9.
// T:O(n), S:O(1)
// 
class Solution {
    public List<Integer> lexicalOrder(int n) {
        int cur = 1;
        List<Integer> ret = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            ret.add(cur);
            if (cur * 10 <= n) {
                cur *= 10;
            } else if (cur % 10 != 9 && cur + 1 <= n) {
                cur++;
            } else {
                // forwarding until last bit is not 9
                while ((cur / 10) % 10 == 9) {
                    cur /= 10;
                }
                cur /= 10;
                cur++;
            }
        }

        return ret;
    }
}