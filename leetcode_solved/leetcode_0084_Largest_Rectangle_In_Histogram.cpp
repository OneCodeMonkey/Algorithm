class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        if(!n)
        	return 0;
        int ret = 0;
        vector<int>L(n, 0);
        vector<int>R(n, 0);

        for(int i = 0; i < n; i++) {
        	int l = i - 1;
        	while(l >= 0 && heights[l] >= heights[i])
        		l = L[l] - 1;
        	L[i] = l + 1;
        }
        for(int i = n - 1; i >= 0; i--) {
        	int r = i + 1;
        	while(r < n && heights[r] >= heights[i])
        		r = R[r] + 1;
        	R[i] = r - 1;
        	ret = max(ret, (R[i] - L[i] + 1) * heights[i]);
        }

        return ret;
    }
};