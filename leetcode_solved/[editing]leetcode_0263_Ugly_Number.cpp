/**
 * AC:
 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Ugly Number.
 * Memory Usage: 8.1 MB, less than 80.00% of C++ online submissions for Ugly Number.
 *
 * 思路：依次整除 2，3，5（或更多质数参数）。最终能得到 1 代表满足。
 * 注意处理 0 的极端情形
 */
class Solution {
public:
    bool isUgly(int num) {
    	if(num == 0)	// 踩坑，又忘记处理极端情形！
    		return false;

    	int a[3] = {2, 3, 5};
    	for(int i = 0; i < 3; i++) {
       		while(num % a[i] == 0) {	// 能整除
       			num = num / a[i];
       		}
    	}

    	if(num == 1)
    		return true;

    	return false;
    }
};