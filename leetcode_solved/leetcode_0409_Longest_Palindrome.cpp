/**
 * AC:
 * Runtime: 4 ms, faster than 84.56% of C++ online submissions for Longest Palindrome.
Memory Usage: 8.8 MB, less than 93.33% of C++ online submissions for Longest Palindrome.
 * 
 */
class Solution {
public:
    int longestPalindrome(string s) {
        int length = s.length();
        vector<int>alphaRecord(52, 0);
        char temp;
        int temp2 = 0, ans = 0;
        for(int i = 0; i < length; i++) {
        	temp = s[i];
        	temp2 = temp;
        	if(temp2 >= 97) {
        		alphaRecord[temp2 - 71]++;
        	} else {
        		alphaRecord[temp2 - 65]++;
        	}
        }

        bool hasOdd = false;
        for(int i = 0; i < 52; i++) {
        	if(!hasOdd)
        		if(alphaRecord[i] % 2 == 1)
        			hasOdd = true;
        	if(alphaRecord[i] % 2 == 0) {
        		ans += alphaRecord[i];
        	} else {
        		ans += alphaRecord[i] - 1;
        	}
        }
        if(hasOdd)
        	ans++;

        return ans;
    }
};