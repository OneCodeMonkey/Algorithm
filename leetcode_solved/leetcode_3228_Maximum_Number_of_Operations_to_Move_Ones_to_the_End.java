// Solution 1: Using extra O(n) space.
// Runtime 20 ms Beats 6.37%
// Memory 50.62 MB Beats 5.22%
// Greedy.
// T:O(n), S:O(n)
// 
class Solution {
    public int maxOperations(String s) {
        int len = s.length(), ret = 0;
        List<List<Integer>> segment = new ArrayList<>();
        int curOne = 0, curZero = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                curOne++;
                curZero = 0;
                if (i - 1 >= 0 && s.charAt(i - 1) == '0') {
                    segment.add(Arrays.asList(0, 1));
                }
            } else {
                curZero++;
                if (i - 1 >= 0 && s.charAt(i - 1) == '1') {
                    segment.add(Arrays.asList(1, curOne));
                }
                curOne = 0;
            }
            if (i == len - 1) {
                if (curOne > 0) {
                    segment.add(Arrays.asList(1, curOne));
                } else {
                    segment.add(Arrays.asList(0, curZero));
                }
            }
        }

        int formerZero = 0;
        for (int i = segment.size() - 1; i >= 0; i--) {
            int num = segment.get(i).get(0), count = segment.get(i).get(1);
            if (num == 0) {
                formerZero++;
            } else {
                ret += formerZero * count;
            }
        }

        return ret;
    }
}


// Solution 2: Using O(1) space.
// Runtime 8 ms Beats 41.80%
// Memory 45.32 MB Beats 66.92%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxOperations(String s) {
        int len = s.length(), ret = 0, formerZero = 0;
        int curOne = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                curOne++;
                if (i + 1 < len && s.charAt(i + 1) == '0') {
                    formerZero++;
                }
            } else {
                if (i + 1 < len && s.charAt(i + 1) == '1') {
                    ret += curOne * formerZero;
                    curOne = 0;
                }
            }

            // reach the start of array.
            if (i == 0) {
                if (s.charAt(i) == '1') {
                    ret += curOne * formerZero;
                }
            }
        }

        return ret;
    }
}