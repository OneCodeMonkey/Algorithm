/**
 * 思路：此题题意是求一个字符串条件匹配的关系。
 * 要保证处理的复杂度尽可能低。
 *
 */
class Solution {
public:
    vector<int> findNumOfValidWords(vector<string>& words, vector<string>& puzzles) {
        unordered_map<int, vector<int>> dict;
        vector<int> count(puzzles.size());

        for(int i = 0; i < puzzles.size(); i++) {
        	vector<int> set_bits;
        	int base = 1 << (puzzles[i][0] - 'a');
        	for(int j = 1; j < 7; j++)
        		set_bits.push_back(puzzles[i][j] - 'a');

        	for(int x = 0; x < 1 << 6; x++) {
        		int s = base;
        		for(int j = 0; j < 6; j++) {
        			if(x & (1 << j))
        				s |= 1 << set_bits[j];
        		}
        		dict[s].push_back(i);
        	}
        }

        for(auto& word: words) {
        	int s = 0;
        	for(auto& ch: word) {
        		s |= 1 << (ch - 'a');
        	}
        	auto it = dict.find(s);
        	if(it != dict.end()) {
        		for(auto& i: it->second)
        			count[i]++;
        	}
        }

        return count;
    }
};
