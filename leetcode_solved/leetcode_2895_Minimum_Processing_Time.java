// AC: Runtime 76 ms Beats 23.37%
// Memory 59.3 MB Beats 57.4%
// Greedy: The problems specify every core will be assigned one task, so task greedy strategy.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int ret = 0;
        Collections.sort(processorTime);
        tasks.sort(Collections.reverseOrder());
        for (int i = 0; i < tasks.size(); i++) {
            int startTime = processorTime.get(i / 4);
            ret = Math.max(startTime + tasks.get(i), ret);
        }

        return ret;
    }
}
