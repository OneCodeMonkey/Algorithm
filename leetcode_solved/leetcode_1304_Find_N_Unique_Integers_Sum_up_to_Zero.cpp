/**
 * AC：Runtime: 4 ms, faster than 98.01% of C++ online submissions for Find N Unique Integers Sum up to Zero.
 * Memory Usage: 6.4 MB, less than 100.00% of C++ online submissions for Find N Unique Integers Sum up to Zero.
 *
 * T:O(n) S:O(n)
 */
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
