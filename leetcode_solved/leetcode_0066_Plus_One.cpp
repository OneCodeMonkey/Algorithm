class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size = digits.size();
        vector<int> ans;
        if(size == 1 && digits[0] == 0) {
        	ans.push_back(1);
        	return ans;
        }

        long long raw = 0, base = 1;
        for(int i = size - 1; i >= 0; i--) {
        	raw += digits[i] * base;
        	if(i != 0)		// 防止 base 溢出
        		base *= 10;
        }
        long long plusNum = raw + 1;
        vector<int> digit2;
        while(plusNum > 0) {
        	digit2.push_back(plusNum % 10);
        	plusNum /= 10;
        }

        for(int i = digit2.size() - 1; i >= 0 ; i--) {
        	ans.push_back(digit2[i]);
        }

        return ans;
    }
};