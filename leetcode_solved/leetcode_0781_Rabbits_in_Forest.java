// AC: Runtime: 2 ms, faster than 86.78% of Java online submissions for Rabbits in Forest.
// Memory Usage: 38.4 MB, less than 77.40% of Java online submissions for Rabbits in Forest.
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int answer : answers) {
            record.merge(answer, 1, Integer::sum);
        }
        int ret = 0;
        for (int answer : record.keySet()) {
            ret += (int) Math.ceil(record.get(answer) * 1.0 / (answer + 1)) * (answer + 1);
        }

        return ret;
    }
}