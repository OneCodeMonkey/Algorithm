// AC: Runtime: 9 ms, faster than 46.20% of Java online submissions for Sort Even and Odd Indices Independently.
// Memory Usage: 44.8 MB, less than 76.02% of Java online submissions for Sort Even and Odd Indices Independently.
// sort
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        odd.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(even);
        int[] ret = new int[nums.length];
        int pos = 0;
        for (int i = 0; i < even.size(); i++) {
            ret[pos++] = even.get(i);
            if (i < odd.size()) {
                ret[pos++] = odd.get(i);
            }
        }

        return ret;
    }
}