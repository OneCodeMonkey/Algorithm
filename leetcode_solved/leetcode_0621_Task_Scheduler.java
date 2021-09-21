// AC: Runtime: 2 ms, faster than 98.96% of Java online submissions for Task Scheduler.
// Memory Usage: 40.4 MB, less than 53.89% of Java online submissions for Task Scheduler.
// .
// T:O(n), S:O(26) ~ O(1)
// 
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counter = new int[26];
        int max = 0, maxCount = 0;
        for (char task: tasks) {
            int charIndex = task - 'A';
            counter[charIndex]++;
            if (counter[charIndex] == max) {
                maxCount++;
            } else if (max < counter[charIndex]) {
                max = counter[charIndex];
                maxCount = 1;
            }
        }

        int partCount = max - 1;
        int partLength = n - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;
    }
}