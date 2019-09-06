/**
 * 思路一： 猜想是否可能为贪心算法？先排序，然后每次取最大的两个石子做一次操作，然后
 * 将结果写回原数组（同时删除此次操作的两颗石子），再对新数组排序，继续重复操作，
 * 直至只剩一颗石子或为空（空返0）。
 * 
 */
class Solution {
public:
	void doOperation(vector<int>& stones) {
		sort(stones.begin(), stones.end());
		vector<int>::iterator largest = stones.begin() + stones.size() - 1;
		vector<int>::iterator second = stones.begin() + stones.size() - 2;
		if(*largest > *second)
			stones.insert(second, (*largest - *second));
		stones.erase(largest);
		stones.erase(second);
	}
    int lastStoneWeightII(vector<int>& stones) {
        while(stones.size() > 1) {
        	doOperation(stones);
        }
    	if(stones.size() == 0)
    		return 0;
    	if(stones.size() == 1)
    		return stones[0];
    }
};
