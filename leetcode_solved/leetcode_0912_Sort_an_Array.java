// Runtime: 5 ms, faster than 98.56% of Java online submissions for Sort an Array.
// Memory Usage: 47.6 MB, less than 86.37% of Java online submissions for Sort an Array.
// Dual-Pivot Quicksort by Vladimir Yaroslavskiy
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}