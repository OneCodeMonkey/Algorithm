/**
 * AC:
 * Runtime: 4 ms, faster than 73.68% of C++ online submissions for Build an Array With Stack Operations.
 * Memory Usage: 7.8 MB, less than 100.00% of C++ online submissions for Build an Array With Stack Operations.
 * 
 * T:O(n) S:O(1)
 */
class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
  		int size = target.size();
  		vector<string> ret;
  		int nowList = 1;

  		for (int i = 0; i < size; i++) {
  			if (target[i] == nowList) {
  				ret.push_back("Push");
  				nowList++;
  			} else {
  				while (nowList <= target[i] - 1) {
	  				ret.push_back("Push");
	  				ret.push_back("Pop");
	  				nowList++;
	  			}
	  			ret.push_back("Push");
	  			nowList++;
  			}
  			
  		}

  		return ret;      
    }
};