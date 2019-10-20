/**
 * AC：
 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Remove Element.
 * Memory Usage: 8.7 MB, less than 38.23% of C++ online submissions for Remove Element.
 *
 * 思路：原地算法，就是不使用额外空间完成预期功能。
 * 这里简单用原数组位置进行替换赋值即可。最后它只会去 return 的值
 * 的 N 位取结果数组。这是这道题隐藏的返回特性。
 */
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
    	int size = nums.size();
        if(size == 0)
        	return 0;

        int count = 0;
        for(int i = 0; i < size; i++) {
        	if(nums[i] != val) {
        		nums[count++] = nums[i];
        	}
        }

        return count;
    }
};