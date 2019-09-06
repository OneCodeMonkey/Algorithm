/**
 * AC:
 * Runtime: 8 ms, faster than 71.54% of C++ online submissions for Swap For Longest Repeated Character Substring.
 * Memory Usage: 9.8 MB, less than 100.00% of C++ online submissions for Swap For Longest Repeated Character Substring.
 *
 */
class Solution {
public:
    int maxRepOpt1(string text) {
    	int ans = 1;
     	vector<vector<int>>idx(26);
     	for(int i = 0; i < text.size(); i++)
     		idx[text[i] - 'a'].push_back(i);
     	for(int m = 0; m < 26; m++) {
     		int cnt = 1, cnt1 = 0, mx = 0;
     		for(int n = 1; n < idx[m].size(); n++) {
     			if(idx[m][n] == idx[m][n - 1] + 1)
     				cnt++;
     			else {
     				cnt1 = idx[m][n] == idx[m][n - 1] + 2 ? cnt : 0;
     				cnt = 1;
     			}
     			mx = max(mx, cnt1 + cnt);
     		}
     		ans = max(ans, mx + (idx[m].size() > mx ? 1 : 0));
     	}
     	return ans;
    }
};
