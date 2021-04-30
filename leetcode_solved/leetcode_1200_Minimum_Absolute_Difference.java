// AC:
// Runtime: 14 ms, faster than 98.16% of Java online submissions for Minimum Absolute Difference.
// Memory Usage: 50.8 MB, less than 13.31% of Java online submissions for Minimum Absolute Difference.
// 
// 复杂度：T:O(nlogn), S:O(n)
//
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0], temp;
        for (int i = 1; i < arr.length - 1; i++) {
            temp = arr[i + 1] - arr[i];
            if (temp < minDiff) {
                minDiff = temp;
            }
        }
        List<List<Integer>> ret = new LinkedList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i + 1] - arr[i];
            if (temp == minDiff) {
                List<Integer> tempList = new LinkedList<Integer>(Arrays.asList(arr[i], arr[i + 1]));
                ret.add(tempList);
            }
        }
        return ret;
    }
}