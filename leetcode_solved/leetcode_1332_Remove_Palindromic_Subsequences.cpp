/**
 * AC:Runtime: 4 ms, faster than 20.49% of C++ online submissions for Remove Palindromic Subsequences.
 * Memory Usage: 6.2 MB, less than 100.00% of C++ online submissions for Remove Palindromic Subsequences.
 *
 * 思路：这里是 subsequence，是子序列，而不是 substring (子字符串)。子序列不要求连续。
 *      所以只有两种可能，一种本身就是回文字符串，那么返回 2(空字符串返0)，一种就是不回文，那么
 *	    第一步去掉所有 ‘a’(子序列1)，第二部去掉所有 'b' （子序列2），就完成了。
 * T:O(n) S:O(0)
 */
class Solution {
public:
    int removePalindromeSub(string s) {
  		if (s.length() == 0) {
  			return 0;
  		}
  		for (int i = 0; i < s.length(); i++) {
  			if (s[i] != s[s.length() - 1 - i]) {
  				return 2;
  			}
  		}

  		return 1;
    }
};