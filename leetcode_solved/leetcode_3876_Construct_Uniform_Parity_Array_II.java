// Runtime 28 ms Beats 29.06% 
// Memory 118.42 MB Beats 94.68%
// Thought: 因为元素无重复，那么先排序。如果最小者是奇数，那么从第二个元素开始，如果它是奇数，那么保留，如果它是偶数，那么减去第一个数则也能得到奇数，则能保证全部奇数，
//          如果最小者是偶数，那么如果第二个元素不是偶数，则无法满足答案，直接 return false.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        if (nums1[0] % 2 == 1) {
            return true;
        }
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}
