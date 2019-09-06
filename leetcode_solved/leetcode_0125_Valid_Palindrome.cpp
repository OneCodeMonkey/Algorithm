/**
 * AC:
 * Runtime: 8 ms, faster than 84.27% of C++ online submissions for Valid Palindrome.
 * Memory Usage: 10.7 MB, less than 6.12% of C++ online submissions for Valid Palindrome.
 * 简单题，注意判断数字的情况，example 中并未给数字的情况，但要注意到这种情形
 * 大小写做下转换，使其ASCII码数字上 大小写相等。纯数字直接用原 ASCII 码
 *
 */
class Solution {
public:
    bool isPalindrome(string s) {
		if (empty(s))
			return true;
		vector<int>vec1;
		for (auto charItem : s) {
			int temp = charItem - 'a';
			int temp2 = charItem - 'A';
			int temp3 = charItem;
			if ((temp >= 0 && temp <= 25))
				vec1.push_back(temp);
			if ((temp2 >= 0 && temp2 <= 25))
				vec1.push_back(temp2);
			if ((temp3 >= 48 && temp3 <= 57))
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
