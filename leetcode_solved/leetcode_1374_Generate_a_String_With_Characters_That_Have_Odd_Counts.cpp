class Solution {
public:
    string generateTheString(int n) {
    	string s = "";
     	if (n % 2 == 0) {
     		s.append(n - 1, 'a');
     		s.append(1, 'b');
     	} else {
     		s.append(n, 'a');
     	}
     		
        return s;
    }
};
