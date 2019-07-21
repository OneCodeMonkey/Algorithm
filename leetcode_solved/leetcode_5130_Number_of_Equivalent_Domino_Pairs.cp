class Solution {
public:
	/**
	 * AC:
	 * Runtime: 1868 ms, faster than 33.33% of C++ online submissions for Number of Equivalent Domino Pairs.
	 * Memory Usage: 21.2 MB, less than 100.00% of C++ online submissions for Number of Equivalent Domino Pairs.
	 *
	 * 思路： 由于可旋转相等，所以当出现匹配的串时，把它门都标记为一个非负数并保存。
	 * 遍历完一遍O（n)以后，对保存的结果，即每个对有多少个重复数，算出最终结果
	 * 比如 1，2，3都能成对，三个数，那么对应 n*(n-1)/2 = 3 个计数。
	 *
	 */
    int numEquivDominoPairs(vector<vector<int>>& dominoes) {
        vector<int> record(dominoes.size() + 1, 0);		// 记录每个位，是否有成对的情况。若有，记录最早成对的index
        unordered_map<int, int>map;			// 记录重复位会重复几次

        for(int i = 0; i < dominoes.size() - 1; i++) {
        	for(int j = i + 1; j < dominoes.size(); j++) {
        		if(record[j])	// 若已匹配过。备忘录 减少循环次数
        			continue;
        		// check is equivalent
        		if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) \
        			|| (dominoes[i][1] == dominoes[j][0] && dominoes[i][0] == dominoes[j][1])) {
        			if(i == 0)	// 特殊情况，dominoes 第一位若匹配成功，记为 1
        				record[0] == 1;
        			record[j] = i + 1;		// 记录index，这里从 1 开始计， + 1
        			map[i]++;
        		}
        	}
        }

        int ret = 0;
        for(auto it:map) {
        	ret += it.second * (it.second + 1) / 2;
        }

        return ret;
    }
};
