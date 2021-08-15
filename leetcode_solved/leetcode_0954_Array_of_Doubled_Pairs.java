// AC: Runtime: 34 ms, faster than 66.99% of Java online submissions for Array of Doubled Pairs.
// Memory Usage: 46.7 MB, less than 63.61% of Java online submissions for Array of Doubled Pairs.
// sort and judge from max, if positive, check max is even and max/2 is never used, is negative, check max * 2 is never used.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public boolean canReorderDoubled(int[] arr) {
        int size = arr.length;
        Arrays.sort(arr);

        HashMap<Integer, List<Integer>> valueToIndex = new HashMap<>();
        int[] used = new int[size];
        for (int i = 0; i < size; i++) {
            if (!valueToIndex.containsKey(arr[i])) {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(i);
                valueToIndex.put(arr[i], tempList);
            } else {
                valueToIndex.get(arr[i]).add(i);
            }
        }

        for (int i = size - 1; i >= 0; i--) {
            if (used[i] == 1) {
                continue;
            }
            if (arr[i] >= 0) {
                if (arr[i] % 2 == 1 || !valueToIndex.containsKey(arr[i] / 2) || valueToIndex.get(arr[i] / 2).size() == 0) {
                    return false;
                }
                List<Integer> tempList = valueToIndex.get(arr[i] / 2);
                int index = tempList.get(tempList.size() - 1);
                tempList.remove(tempList.size() - 1);
                used[index] = 1;
                used[i] = 1;
            } else {
                if (!valueToIndex.containsKey(arr[i] * 2) || valueToIndex.get(arr[i] * 2).size() == 0) {
                    return false;
                }
                List<Integer> tempList = valueToIndex.get(arr[i] * 2);
                int index = tempList.get(tempList.size() - 1);
                tempList.remove(tempList.size() - 1);
                used[index] = 1;
                used[i] = 1;
            }
        }

        return true;
    }
}