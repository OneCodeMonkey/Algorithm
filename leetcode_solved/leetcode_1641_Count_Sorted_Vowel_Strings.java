// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Sorted Vowel Strings.
// Memory Usage: 35.8 MB, less than 45.81% of Java online submissions for Count Sorted Vowel Strings.
// accumulate by 5-way recursive sum.
// T:O(n), S:O(1)
// 
class Solution {
    public int countVowelStrings(int n) {
        int ret = 5, t1 = 1, t2 = 1, t3 = 1, t4 = 1, t5 = 1;
        for (int i = 2; i <= n; i++) {
            t1 = ret;
            t2 += t3 + t4 + t5;
            t3 += t4 + t5;
            t4 += t5;
            ret = t1 + t2 + t3 + t4 + t5;
        }

        return ret;
    }
}