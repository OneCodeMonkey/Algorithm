class Solution {
public:
	int doOperation(int n) {
		int ret = 0;
		while(n) {
			ret += (n % 10) * (n % 10);
			n = n / 10;
		}
		return ret;
	}
    bool isHappy(int n) {
     	int temp = doOperation(n);
     	int temp2;
     	if(temp == 1)
     		return true;
     	while(temp != 1) {
     		temp2 = doOperation(n);
     		if(temp2 == 1)
     			return true;
     		if(temp2 == temp)
     			return false;

     		temp = temp2;
     	}
     	return false;
    }
};
