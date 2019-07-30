class Solution {
public:
    int maxProfit(vector<int>& prices) {
   		int n = prices.size();
   		vector<int> lmax(n, 0);
   		vector<int> rmax(n, 0);

   		int minT = INT_MAX;
   		int tempMax = 0;
   		for(int i = 0; i < n; i++) {
   			if(prices[i] < minT) {
   				minT = prices[i];
   			} else {
   				tempMax = max(tempMax, prices[i] - minT);
   			}
   			lmax[i] = tempMax;
   		}
   		int maxT = INT_MIN;
   		tempMax = 0;
   		for(int i = n - 1; i >= 0; i--) {
   			if(prices[i] > maxT) {
   				maxT = prices[i];
   			} else {
   				tempMax = max(tempMax, maxT - prices[i]);
   			}
   			rmax[i] = tempMax;
   		}

   		int ans = 0;
   		for(int i = 0; i < n; i++)
   			ans = max(ans, lmax[i] + rmax[i]);

   		return ans;
    }
};
