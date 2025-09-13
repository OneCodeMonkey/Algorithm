// Runtime 0 ms Beats 100.00% 
// Memory 9.72 MB Beats 13.58%
// . 
// T:O(n) S:O(n)
// 
class Solution {
public:
    vector<int> sumZero(int n) {
  		vector<int> ret;
		for (int i = -(n / 2); i <= (n / 2); i++) {
			if (i == 0 && n % 2 == 0) continue;
			ret.push_back(i);
		}

  		return ret;
    }
};
