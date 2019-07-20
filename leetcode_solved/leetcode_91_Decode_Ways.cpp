class Solution {
public:
    int numDecodings(string s) {
		int n = s.length();
		int a = 1, b = 1;
		if(s[n - 1] != '0') {
			b = 1;
		} else {
			b = 0;
		}

		if(n == 1)
			return b;

		if(s[n - 2] != '0') {
			a = b;
			if(((s[n - 2] - '0') * 10 + s[n - 1] - '0') <= 26) {
				a += 1;
			}
		} else {
			a = 0;
		}

		for(int i = n - 3; i >= 0; i--) {
			int temp = 1;
			if(s[i] != '0') {
				temp = a;
				if(((s[i] - '0') * 10 + s[i + 1] - '0') <= 26)
					temp += b;
			} else {
				temp = 0;
			}

			b = a;
			a = temp;
		}

		return a;
	}
};
