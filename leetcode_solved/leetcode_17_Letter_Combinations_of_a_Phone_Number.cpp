class Solution {
public:
    vector<string> letterCombinations(string digits) {
        int len = strlen(digits);

        // record how many alpha choices each number have.
        int choiceCount[8] = {3, 3, 3, 3, 3, 4, 3, 4};

        int alpha[8][4] = {
        	{'a', 'b', 'c'},
        	{'d', 'e', 'f'},
        	{'g', 'h', 'i'},
        	{'j', 'k', 'l'},
        	{'m', 'n', 'o'},
        	{'p', 'q', 'r', 's'},
        	{'t', 'u', 'v'},
        	{'w', 'x', 'y', 'z'},
        };

        vector<string> ret;

        while(--len) {
        	string str = '';
        	
        	
        }

        return ret;
    }
};
