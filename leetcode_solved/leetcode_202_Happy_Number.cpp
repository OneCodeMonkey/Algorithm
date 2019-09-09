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
