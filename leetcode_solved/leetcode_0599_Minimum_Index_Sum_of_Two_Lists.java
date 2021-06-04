// AC: Runtime: 65 ms, faster than 10.82% of Java online submissions for Minimum Index Sum of Two Lists.
// Memory Usage: 39.7 MB, less than 35.84% of Java online submissions for Minimum Index Sum of Two Lists.
// .
// T:O(len(list1) * len(list2)), S:O(min(len(list1), len(list2)))
// 
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < list1.length && i <= minSum; i++) {
            for (int j = 0; j < list2.length && i + j <= minSum; j++) {
                if (list1[i].equals(list2[j])) {
                    if (i + j < minSum) {
                        minSum = i + j;
                    }
                }
            }
        }

        for (int i = 0; i < list1.length && i <= minSum; i++) {
            for (int j = 0; j < list2.length && i + j <= minSum; j++) {
                if (list1[i].equals(list2[j]) && i + j == minSum) {
                    ret.add(i);
                }
            }
        }
        String[] retArr = new String[ret.size()];
        int pos = 0;
        for (int i: ret) {
            retArr[pos++] = list1[i];
        }

        return retArr;
    }
}