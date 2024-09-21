// Runtime 13 ms Beats 26.67%
// Memory 46.28 MB Beats 21.89%
// Convert to Integer & sort. Notice the head and tail difference should also be included.
// T:O(n), S:O(n)
// 
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int ret = Integer.MAX_VALUE;
        List<Integer> toMinutes = new ArrayList<>();
        for (String timePoint : timePoints) {
            toMinutes.add(convert(timePoint));
        }
        Collections.sort(toMinutes);
        ret = 24 * 60 - (toMinutes.get(toMinutes.size() - 1) - toMinutes.get(0));
        for (int i = 0; i < toMinutes.size() - 1; i++) {
            ret = Math.min(ret, toMinutes.get(i + 1) - toMinutes.get(i));
            if (ret == 0) {
                break;
            }
        }

        return ret;
    }

    private int convert(String timePoint) {
        String[] arr = timePoint.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}
