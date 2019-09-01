/**
 * 先算表，再查表
 * 时间复杂度是 O(n)
 *
 */
class Solution {
public:
    void generate(vector<int> a, int k, vector<int> &dp) {
        int size = dp.size() - 1;
        dp[k] = 0;
        for (int i = 0; i < k; i++)
            dp[k] += a[i];
        for (int i = k + 1; i <= size; i++)
            dp[i] = dp[i - 1] + a[i - 1] - a[i - k - 1];
    }
    int dietPlanPerformance(vector<int>& calories, int k, int lower, int upper) {
        int size = calories.size();
        int point = 0;
        vector<int> dp(size + 1, -1);
        generate(calories, k, dp);
        for (int i = 0; i < size - k + 1; i++) {
            if (dp[i + k] < lower)
                point--;
            else if (dp[i + k] > upper)
                point++;
        }
        return point;
    }
};
