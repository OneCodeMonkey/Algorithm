class Solution {
public:
	/* 本题实质上是求一类变种的全排列情况的问题，下面的递归做法很有意思！ */

    vector<string> letterCombinations(string digits) { 
        vector<string> result;
        int n = digits.length();
        if(!n)
        	return vector<string>();

        static const vector<string> v = {
        	"",
        	"",
        	"abc",
        	"def",
        	"ghi",
        	"jkl",
        	"mno",
        	"pqrs",
        	"tuv",
        	"wxyz"
        };

        result.push_back("");	// add a seed for the initial case

        for(int i = 0; i < n; i++) {
        	int num = digits[i] - '0';
        	if(num < 2 || num > 9)
        		break;
        	const string& temp = v[num];
        	if(temp.empty())
        		continue;

        	vector<string> temp2;

        	for(int j = 0; j < temp.size(); j++)
        		for(int k = 0; k < result.size(); k++)
        			temp2.push_back(result[k] + temp[j]);		// 累积上一轮的变化情况

        	result.swap(temp2);
        }

        return result;
    }
};
