/**
 * 思路：只需判断 sum(arr, 1, i) == i * (i + 1) / 2, 若满足则 i 时刻是符合的。
 * 注意：看到限制条件，要用 ll int, 否则会整数溢出
 * AC:
 * Runtime: 84 ms, faster than 82.06% of C++ online submissions for Bulb Switcher III.
 * Memory Usage: 12.8 MB, less than 100.00% of C++ online submissions for Bulb Switcher III.
 */
class Solution {
public:
    int numTimesAllBlue(vector<int>& light) {
        int size = light.size(), ret = 0;
        long long int sum = 0, compare = 1;

        for(int i = 0; i < size; i++) {
        	sum += light[i];
        	compare *= (i + 1);
        	compare *= (i + 2);
        	compare /= 2;
        	if (sum == compare)
        		ret++;
        }

        return ret;
    }
};
