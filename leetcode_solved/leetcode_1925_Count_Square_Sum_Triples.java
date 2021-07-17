// AC: Runtime: 5 ms, faster than 96.60% of Java online submissions for Count Square Sum Triples.
// Memory Usage: 35.7 MB, less than 90.78% of Java online submissions for Count Square Sum Triples.
// .
// T:O(n* (n - sqrt(n)) ), S:O(1)
// 
class Solution {
    public int countTriples(int n) {
        int ret = 0;
        for (int i = n; i >= 5; i--) {
            for (int j = i - 1; j > (int) Math.sqrt(i * i / 2.0); j--) {
                int temp = (int) Math.sqrt(i * i - j * j);
                if (temp * temp + j * j == i * i) {
                    ret += 2;
                }
            }
        }

        return ret;
    }
}