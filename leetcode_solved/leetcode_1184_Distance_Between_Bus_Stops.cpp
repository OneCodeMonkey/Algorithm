class Solution {
public:
    int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
		vector<int> sumK;	// 计算 i 位置到 0 的顺次出发的路径距离
		int sum = 0;
		sumK.push_back(0);

		for (int i = 0; i < distance.size(); i++)
			sum += distance[i];

		for (int i = 0; i < distance.size() - 1; i++) {
			sumK.push_back(sumK[i] + distance[i]);
		}

		return min(abs(sumK[destination] - sumK[start]), sum - abs(sumK[destination] - sumK[start]));
	}
};