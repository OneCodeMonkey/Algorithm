// AC: Runtime: 6 ms, faster than 5.79% of Java online submissions for Pancake Sorting.
// Memory Usage: 39.3 MB, less than 29.43% of Java online submissions for Pancake Sorting.
// for a k-operation and k + 1 operation, will let arr[k] be in front of the array, so can use this to 
// let the biggest element to the front one by one until the smallest one.
// T:O(n^2), S:O(n)
// 
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ret = new LinkedList<>();
        int size = arr.length;

        List<Integer> copyList = new LinkedList<>();
        for (int i: arr) {
            copyList.add(i);
        }

        int[] copy = new int[size];
        System.arraycopy(arr, 0, copy, 0, size);
        Arrays.sort(copy);
        for (int i = size - 1; i >= 0; i--) {
            int index = -1;
            for (int j = 0; j < size; j++) {
                if (copy[i] == copyList.get(j)) {
                    index = j;
                    copyList.remove((Integer) copy[i]);
                    copyList.add(0, copy[i]);
                    break;
                }
            }
            if (index != 0) {
                ret.add(index);
                ret.add(index + 1);
            }
        }

        return ret;
    }
}