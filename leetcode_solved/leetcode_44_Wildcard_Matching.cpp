class Solution{
public:
	bool isMatch(string s, string p) {
		int i = 0;
		int j = 0;
		int m = s.length();
		int n = p.length();
		int last_match = -1;
		int starj = -1;

		while(i < m) {
			if(j < n && (s[i] == p[j] || p[j] == '?')) {
				i++;
				j++;
			} else if(j < n && p[j] == '*') {
				starj = j;
				j++;
				last_match = i;
			} else if(starj != -1) {
				j = starj + 1;
				last_match++;
				i = last_match;
			} else
				return false;
		}

		while(p[j] == '*' && j < n)
			j++;
		return j == n;
	}
};
