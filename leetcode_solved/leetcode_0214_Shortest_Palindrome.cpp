/**
 * Brute-force can't pass...
 * AC：
 * Runtime: 4 ms, faster than 91.10% of C++ online submissions for Shortest Palindrome.
 * Memory Usage: 10.1 MB, less than 71.43% of C++ online submissions for Shortest Palindrome.
 *
 */
class Solution {
public:
    // string shortestPalindrome(string s) {
    //     int size = s.size();
    //     if(size == 0) {
    //      string s = "";
    //      return s;
    //     }

    //     int maxPos = 0;
    //     for(int i = 0; i < size; i++) {
    //      bool flag = true;
    //      for(int j = 0; j < i / 2; j++) {
    //          if(s[j] != s[i - j]) {
    //              flag = false;
    //              break;
    //          }
    //      }
    //      if(flag)
    //          maxPos = i;
    //     }

    //     string ret = "";
    //     for(int i = size - 1; i > maxPos; i++)
    //      ret += s[i];

    //     ret += s;

    //     return ret;
    // }

    string shortestPalindrome(string s) {
        string rev_s = s;
        reverse(rev_s.begin(), rev_s.end());
        string l = s + "#" + rev_s;

        vector<int> p(l.size(), 0);
        for(int i = 1; i < l.size(); i++) {
            int j = p[i - 1];
            while(j > 0 && l[i] != l[j])
                j = p[j - 1];

            p[i] = (j += l[i] == l[j]);
        }

        return rev_s.substr(0, s.size() - p[l.size() - 1]) + s;
    }
};
