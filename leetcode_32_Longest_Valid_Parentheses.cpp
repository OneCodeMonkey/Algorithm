class Solution {
public:
	int longestValidParentheses(string s) {
		int n = s.length(), maxL = 0;
		stack<int> st;
		// st 中最终只剩下 去除所有 “相邻成对括号组合”后的所有‘（’和‘）’的pos
		for (int i = 0; i < n; i++) {
			if (s[i] == '(')
				st.push(i);
			else {
				if (!st.empty()) {
					if (s[st.top()] == '(')
						st.pop();
					else
						st.push(i);
				}
				else {
					st.push(i);
				}
			}
		}
		if (st.empty())	// 全部都已成对
			maxL = n;
		else {
			int r = n, q = 0;
			while (!st.empty()) {
				q = st.top();
				st.pop();
				maxL = max(maxL, r - q - 1);
				r = q;
			}
			maxL = max(maxL, r);
		}
		return maxL;
	}

};