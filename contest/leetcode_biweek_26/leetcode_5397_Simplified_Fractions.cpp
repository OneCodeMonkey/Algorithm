/**
 * AC
 *
 */
class Solution {
public:
    vector<string> simplifiedFractions(int n) {
		vector<string> ret;
		if (n == 1) {
			return ret;
		}

		// 用 set 对结果去重
		set<string> record;

		for (int i = 2; i <= n; i++) {
			// 求出分母为 i 下的所有最简真分数，添加进 set
			int num1, num2, temp;
			for (int j = 1; j < i; j++) {
				num1 = i;
				num2 = j;

				while (num2 != 0) {
					temp = num1 % num2;
					num1 = num2;
					num2 = temp;
				}
				if (num1 == 1) {
					string result = to_string(j) + "/" + to_string(i);
					record.insert(result);
				}
			}
		}

		set<string>::iterator it;
		for(it = record.begin(); it != record.end(); it++) {
			ret.push_back(*it);
		}

		return ret;
	}
};