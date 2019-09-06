/**
 * 思路一： 猜想是否可能为贪心算法？先排序，然后每次取最大的两个石子做一次操作，然后
 * 将结果写回原数组（同时删除此次操作的两颗石子），再对新数组排序，继续重复操作，
 * 直至只剩一颗石子或为空（空返0）。
 * 
 * 试验失败。反例：[31,26,33,21,40]   output: 9  expected: 5
 * 
 * 
 */
class Solution {
public:
	void doOperation(vector<int>& stones) {
		sort(stones.begin(), stones.end());
		int size = stones.size(), temp = 0;
		vector<int>::iterator largest = stones.begin() + size - 1;
		vector<int>::iterator second = stones.begin() + size - 2;

		if (*largest > *second)
			temp = (*largest - *second);

		stones.erase(largest);
		stones.erase(second);
		if(temp > 0)
			stones.push_back(temp);
	}
	int lastStoneWeightII(vector<int>& stones) {
		while (stones.size() > 1) {
			doOperation(stones);
		}
		if (stones.size() == 0)
			return 0;
		if (stones.size() == 1)
			return stones[0];

		return 0;		// 不会走到这一步，但貌似 leetcode 的编译器必须要形式上有这个返回值，
						// 本地 VS2017 C++ 环境调试可以不加这行
	}
};
