class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size = digits.size();
        vector<int> ans;
        
        int flag = 1;	// 是否需要进位
        for(int i = size - 1; i >= 0; i--) {
        	if(flag == 1) {
        		if(digits[i] + 1 > 10) {
	        		digits[i] = (digits[i] + 1) % 10;
	        		flag = 1;
	        		if(i == 0) {
	        			digits.insert(digits.begin(), 1);
	        		}
        		} else {
        			digits[i] += 1;
        			flag = 0;
        		}
        	}
        }

        return digits;
    }
};