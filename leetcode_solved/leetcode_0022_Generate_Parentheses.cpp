class Solution {
public:
    vector<string> generateParenthesis(int n) {
	vector<string> ret;
	string tempStr2 = "";
	ret.push_back(tempStr2);

	for (int i = 0; i < 2 * n; i++) {
		for (int j = 0; j < ret.size(); j++) {
			int top = getTop(ret[j]);
			int leftBracketCount = getLeftBracketCount(ret[j]);

			if (top == 1) {		// 栈顶为 ‘（’
				if (leftBracketCount <= n - 1) {	// 能继续加 左括号
					string tempStr = ret[j] + "(";
					ret[j] = ret[j] + ")";
					ret.push_back(tempStr);
				} else if(leftBracketCount == n) {	// 只能加右括号了
					ret[j] = ret[j] + ")";
				}
			} if (top == -1 && leftBracketCount <= n - 1) {	// 栈顶为空
				ret[j] = ret[j] + "(";
			}
		}
	}

	return ret;
}

private:
	/* 返回一个当前括号串的 stack 状态的 栈顶，‘(’ 返回1，‘空’ 返回-1, 若已存在不合法的匹配，返回 -2 */
	int getTop(string s) {
		stack<int> str;
		for (int i = 0; i < s.length(); i++) {
			if (s[i] == '(')
				str.push(1);
			else {
				if (str.empty()) {
					return -2;
				}
				else {
					str.pop();
				}
			}
		}
		if (str.empty())
			return -1;
		else
			return 1;
	}

	int getLeftBracketCount(string s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s[i] == '(')
				count++;
		}
		return count;
	}
};
