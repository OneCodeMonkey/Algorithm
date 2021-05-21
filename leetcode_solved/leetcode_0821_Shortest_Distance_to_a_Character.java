// AC: Runtime: 1 ms, faster than 97.49% of Java online submissions for Shortest Distance to a Character.
// Memory Usage: 38.6 MB, less than 97.68% of Java online submissions for Shortest Distance to a Character.
// 先找出 c 的所有位置，再从非 c 的位置两边同时找最近的 c 的距离
// T:O(n), S:O(1)
// 
class Solution {
    public int[] shortestToChar(String s, char c) {
        int size = s.length();
        int[] ret = new int[size];
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == c) {
                ret[i] = -1;
            }
        }
        for (int i = 0; i < size; i++) {
            if (ret[i] != -1) {
                int offset = 1;
                while (true) {
                    if (i + offset < size) {
                        if (ret[i + offset] == -1) {
                            break;
                        }
                    }
                    if (i - offset >= 0) {
                        if (ret[i - offset] == -1) {
                            break;
                        }
                    }
                    offset++;
                }
                ret[i] = offset;
            }
        }
        for (int i = 0; i < size; i++) {
            if (ret[i] == -1) {
                ret[i] = 0;
            }
        }

        return ret;
    }
}
