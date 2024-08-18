// Runtime 2 ms Beats 100.00%
// Memory 44.97 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ret = 0;
        for (String command : commands) {
            switch (command) {
                case "UP":
                    ret -= n;
                    break;
                case "RIGHT":
                    ret += 1;
                    break;
                case "DOWN":
                    ret += n;
                    break;
                case "LEFT":
                    ret -= 1;
                    break;
                default:
                    break;
            }
        }

        return ret;
    }
}
