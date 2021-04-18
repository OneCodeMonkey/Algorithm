// AC:
// Runtime: 103 ms, faster than 57.14% of Java online submissions for Single-Threaded CPU.
// Memory Usage: 96.7 MB, less than 14.29% of Java online submissions for Single-Threaded CPU.
// 思路：用优先级队列，模拟当前 CPU 可选的任务池，
// 
class Solution {
    public int[] getOrder(int[][] tasks) {
        int taskCount = tasks.length;
        int[] ret = new int[taskCount];
        int[][] taskRecord = new int[taskCount][3];
        for(int i = 0; i < taskCount; i++) {
            taskRecord[i][0] = i;
            taskRecord[i][1] = tasks[i][0];
            taskRecord[i][2] = tasks[i][1];
        }
        Arrays.sort(taskRecord, (a, b) -> (a[1] - b[1]));
        // 按执行时间越短排越前
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[2] == b[2] ? a[0] - b[0] : a[2] - b[2]);
        int time = 0, step = 0, timeStep = 0;
        while (step < taskCount) {
            while (timeStep < taskCount && taskRecord[timeStep][1] <= time) {
                queue.offer(taskRecord[timeStep++]);
            }
            if (queue.isEmpty()) {
                time = taskRecord[timeStep][1];
                continue;
            }
            int[] curTask = queue.poll();
            ret[step++] = curTask[0];
            time += curTask[2];
        }

        return ret;
    }
}