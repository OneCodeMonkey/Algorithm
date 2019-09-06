// 简单题，注意判断数字的情况，example 中并未给数字的情况，但要注意到这种情形
class Solution {
public:
    bool isPalindrome(string s) {
		if (empty(s))
			return true;
		vector<int>vec1;
		for (auto charItem : s) {
			int temp = charItem - 'a';
			int temp2 = charItem - 'A';
			int temp3 = charItem - '0';
			if ((temp >= 0 && temp <= 25))
				vec1.push_back(temp);
			if ((temp2 >= 0 && temp2 <= 25))
				vec1.push_back(temp2);
			if ((temp3 >= 0 && temp3 <= 10))
				vec1.push_back(temp3);
		}

		int size = vec1.size();
		for (int i = 0; i < size / 2; i++) {
			if (vec1[i] != vec1[size - 1 - i])
				return false;
		}

		return true;
	}
};
