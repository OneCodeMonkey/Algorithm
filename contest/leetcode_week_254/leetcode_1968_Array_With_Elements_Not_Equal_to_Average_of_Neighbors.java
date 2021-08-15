// AC:Runtime: 33 ms, faster than 21.43% of Java online submissions for Array With Elements Not Equal to Average of Neighbors.
// Memory Usage: 63.5 MB, less than 21.43% of Java online submissions for Array With Elements Not Equal to Average of Neighbors.
// .
// T:O(n) ~ O(n^2), S:O(n)
//
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        List<Integer> temp = new ArrayList<>(size);
        for (int i: nums) {
            temp.add(i);
        }
        while (!check(temp)) {
            Collections.shuffle(temp);
        }
        int[] ret = new int[size];
        for (int i = 0; i < temp.size(); i++) {
            ret[i] = temp.get(i);
        }

        return ret;
    }

    private boolean check(List<Integer> nums) {
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i) * 2 == nums.get(i - 1) + nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}