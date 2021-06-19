// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
// Memory Usage: 46.9 MB, less than 36.10% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
// .
// T:O(n), S:O(1)
//
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0, tempSum = 0, count = 0;
        for (int i: arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
            if (tempSum == sum / 3) {
                tempSum = 0;
                count++;
                if (count == 3) {
                    break;
                }
            }
        }

        return count == 3;
    }
}