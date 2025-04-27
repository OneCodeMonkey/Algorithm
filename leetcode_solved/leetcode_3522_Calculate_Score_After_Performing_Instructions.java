// Runtime 9 ms Beats 30.78% 
// Memory 70.20 MB Beats 38.79%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long ret = 0;
        HashSet<Integer> visited = new HashSet<>();
        int cur = 0;
        while (true) {
            String instruction = instructions[cur];
            int prev = cur;
            if (instruction.equals("add")) {
                ret += values[cur];
                cur++;
            } else {
                cur = cur + values[cur];
            }
            if (cur < 0 || cur >= instructions.length || visited.contains(cur)) {
                break;
            }
            visited.add(prev);
        }

        return ret;
    }
}
