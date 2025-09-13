// Time: Runtime 0 ms Beats 100.00%
// Memory 8.13 MB Beats 87.48%
//
//
//
class Solution {
public:
	bool isContainZero(int a) {
		while(a) {
			if(a % 10 == 0) {
				return true;
			}
			a /= 10;
		}
		return false;
	}
    vector<int> getNoZeroIntegers(int n) {
        vector<int> ret;
        for(int i = 1; i < n; i++) {
        	if(!isContainZero(i) && !isContainZero(n - i)) {
        		ret.push_back(i);
        		ret.push_back(n - i);
        		break;
        	}
        }

        return ret;
    }
};
