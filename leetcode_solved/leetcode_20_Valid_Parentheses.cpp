class Solution {
public:
    bool isValid(string s) {
     	stack<int>s1;
     	int len = s.length(), pos = 0;
     	while(pos < len) {
     		if(s[pos] == '(')
     			s1.push(1);
     		if(s[pos] == '[')
     			s1.push(2);
     		if(s[pos] == '{')
     			s1.push(3);
     		if(s[pos] == ')')
     			if(!s1.empty() && s1.top() == 1)
     				s1.pop();
     			else
     				return false;
     		else if(s[pos] == ']')
     			if(!s1.empty() && s1.top() == 2)
     				s1.pop();
     			else
     				return false;
     		else if(s[pos] == '}')
     			if(!s1.empty() && s1.top() == 3)
     				s1.pop();
     			else
     				return false;
     		pos++;
     	}
     	if(!s1.empty())
     		return false;
     	return true;
    }
};