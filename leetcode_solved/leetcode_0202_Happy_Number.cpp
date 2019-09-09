/**
 * AC:
 * Runtime: 4 ms, faster than 66.37% of C++ online submissions for Happy Number.
 * Memory Usage: 8.3 MB, less than 88.46% of C++ online submissions for Happy Number.
 * 思路：很直白的题。但注意判断何种条件下会进入无法跳出的循环计算中。
 * 用 vector 记录无法得1时，每次的历史值。只要当前一次操作后的值等于某次
 * 历史值，则可以说明已经进入死循环。这是充分条件。
 *
 */
class Solution {
public:
	int doOperation(int n) {
		int ret = 0;
		while (n) {
			ret += (n % 10) * (n % 10);
			n = n / 10;
		}
		return ret;
	}
	bool isHappy(int n) {
		int temp = doOperation(n);
		int temp2;
		vector<int> record;
		if (temp == 1)
			return true;
		record.push_back(temp);

		while (temp != 1) {
			temp2 = doOperation(temp);
			if (temp2 == 1)
				return true;

			vector<int>::iterator ret;
			ret = std::find(record.begin(), record.end(), temp2);

			if (ret != record.end())	// 记录是否进入无法跳出的循环
				return false;

			record.push_back(temp2);

			temp = temp2;
		}
		return false;
	}
};
