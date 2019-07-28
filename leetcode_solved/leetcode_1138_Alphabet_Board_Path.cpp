class Solution {
public:
	/**
	 * AC !
	 */
    int getR(char c) {	// 获取所在行数
		if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e')
			return 0;
		if (c == 'f' || c == 'g' || c == 'h' || c == 'i' || c == 'j')
			return 1;
		if (c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o')
			return 2;
		if (c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't')
			return 3;
		if (c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y')
			return 4;
		if (c == 'z')
			return 5;
		return -1;
	}
	int getC(char c) {	// 获取所在列数
		if (c == 'a' || c == 'f' || c == 'k' || c == 'p' || c == 'u' || c == 'z')
			return 0;
		if (c == 'b' || c == 'g' || c == 'l' || c == 'q' || c == 'v')
			return 1;
		if (c == 'c' || c == 'h' || c == 'm' || c == 'r' || c == 'w')
			return 2;
		if (c == 'd' || c == 'i' || c == 'n' || c == 's' || c == 'x')
			return 3;
		if (c == 'e' || c == 'j' || c == 'o' || c == 't' || c == 'y')
			return 4;
		return -1;
	}

	string alphabetBoardPath(string target) {
		vector<string> board = {
			"abcde",
			"fghij",
			"klmno",
			"pqrst",
			"uvwxy",
			"z"
		};
		string s = "";
		int nowX = 0;
		int nowY = 0;
		char nowC = 'a';
		for (int i = 0; i < target.length(); i++) {
			int desX = getR(target[i]);
			int desY = getC(target[i]);
			// 分是不是 ‘z’处理
			if (target[i] == 'z') {
				for (int j = 0; j < abs(desY - nowY); j++) {
					s += 'L';
				}
				for (int k = 0; k < abs(nowX - desX); k++) {
					s += 'D';
				}
				s += '!';
			}
			else {
				if (desX > nowX) {
					for (int i = 0; i < abs(desX - nowX); i++)
						s += 'D';
				}
				else {
					for (int i = 0; i < abs(desX - nowX); i++)
						s += 'U';
				}
				if (desY > nowY) {
					for (int i = 0; i < abs(desY - nowY); i++)
						s += 'R';
				}
				else {
					for (int i = 0; i < abs(desY - nowY); i++)
						s += 'L';
				}
				s += '!';
			}
			nowX = desX;	// 更新当前位置
			nowY = desY;	// 更新当前位置
		}

		return s;
	}
};
