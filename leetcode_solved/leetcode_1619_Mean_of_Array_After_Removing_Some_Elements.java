// AC: Runtime: 2 ms, faster than 98.66% of Java online submissions for Mean of Array After Removing Some Elements.
// Memory Usage: 39.2 MB, less than 35.97% of Java online submissions for Mean of Array After Removing Some Elements.
// .
// T:O(nlogn), S:O(1)
//
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length, sum = 0;
        for (int i = size / 20; i < 19 * size / 20; i++) {
            sum += arr[i];
        }
        
        return sum / (18 * size / 20 * 1.00000);
    }
}