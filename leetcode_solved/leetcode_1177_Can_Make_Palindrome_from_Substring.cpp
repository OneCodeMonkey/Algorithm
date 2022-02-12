// AC: Runtime: 1004 ms, faster than 15.77% of C++ online submissions for Can Make Palindrome from Substring.
// Memory Usage: 194.8 MB, less than 16.15% of C++ online submissions for Can Make Palindrome from Substring.
// .
// T:O(m + n), S:(m), m = s.length(), n = queries.length
// 
class Solution {
public:
    vector<bool> canMakePaliQueries(string s, vector<vector<int>>& queries) {
        vector<bool> ret;
        vector<vector<int>>vec;

        vector<int>tmp(26, 0);
        vec.push_back(tmp);

        for(int i = 0; i < s.size(); i++) {
        	tmp[s[i] - 'a']++;
        	vec.push_back(tmp);
        }

        for(auto const& q:queries) {
        	int low = q[0], high = q[1], k = q[2];
        	vector<int> vec2 = vec[high + 1];
        	int odds = 0, sum = 0;
        	for(int i = 0; i < 26; i++) {
        		vec2[i] -= vec[low][i];
        		sum += vec2[i];
        		odds += (vec2[i] % 2);
        	}

        	ret.push_back((odds -= (sum % 2)) <= k * 2 ? true : false);
        }
        return ret;
    }
};
