// AC: Runtime: 16 ms, faster than 5.52% of Java online submissions for Robot Bounded In Circle.
// Memory Usage: 40.5 MB, less than 5.04% of Java online submissions for Robot Bounded In Circle.
// using at most 4-loop to check instructions can make how many moves. using two loop to check whether it forms a circle.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isRobotBounded(String instructions) {
        HashSet<String> record = new HashSet<>();
        int curX = 0, curY = 0, dir = 0;
        record.add(curX + "#" + curY);
        int[] count = new int[2];
        for (int loop = 0; loop < 2; loop++) {
            for (int i = 0; i < 4; i++) {
                for (char c : instructions.toCharArray()) {
                    if (c == 'G') {
                        if (dir == 0) {
                            curY++;
                        } else if (dir == 1) {
                            curX++;
                        } else if (dir == 2) {
                            curY--;
                        } else {
                            curX--;
                        }

                        // check loop
                        String temp = curX + "#" + curY;
                        record.add(temp);
                    } else if (c == 'L') {
                        dir = (dir == 0) ? 3 : dir - 1;
                    } else {
                        dir = (dir == 3) ? 0 : dir + 1;
                    }
                }
            }
            count[loop] = record.size();
        }

        return count[0] == count[1];
    }
}