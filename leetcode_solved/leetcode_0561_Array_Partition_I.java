// AC: Runtime: 10 ms, faster than 96.28% of Java online submissions for Array Partition I.
// Memory Usage: 40.6 MB, less than 93.76% of Java online submissions for Array Partition I.
// sort and sum every 2*i + 1 ,i is from 0 to n/2 - 1.
// T:O(nlogn), S:O(logn), logn is the sort used.
//
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ret += nums[i];
        }
        
        return ret;
    }
}