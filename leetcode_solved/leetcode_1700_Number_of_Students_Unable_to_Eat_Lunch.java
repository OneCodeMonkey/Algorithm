// AC: Runtime: 2 ms, faster than 17.45% of Java online submissions for Number of Students Unable to Eat Lunch.
// Memory Usage: 37.3 MB, less than 20.75% of Java online submissions for Number of Students Unable to Eat Lunch.
// use queue
// T:O(n), S:O(n)
//
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        Stack<Integer> sdw = new Stack<>();
        for (int i: students) {
            stu.offer(i);
        }
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sdw.add(sandwiches[i]);
        }
        int continuousNotEatCount = 0;
        while (!stu.isEmpty()) {
            if (sdw.peek().equals(stu.peek())) {
                stu.poll();
                sdw.pop();
                continuousNotEatCount = 0;
            } else {
                stu.offer(stu.peek());
                stu.poll();
                continuousNotEatCount++;
            }
            if (continuousNotEatCount >= stu.size()) {
                break;
            }
        }

        return stu.size();
    }
}