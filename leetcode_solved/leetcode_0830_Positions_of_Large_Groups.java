// AC: untime: 1 ms, faster than 100.00% of Java online submissions for Positions of Large Groups.
// Memory Usage: 38.9 MB, less than 87.19% of Java online submissions for Positions of Large Groups.
// .
// T:O(n), S:O(1)
//
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new LinkedList<>();
        int size = s.length();
        if (size < 3) {
            return ret;
        }
        int start = 0, end = 0;
        for (int i = 1; i < size; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                end++;
                if (i == size - 1) {
                    if (end - start + 1 >= 3) {
                        List<Integer> temp = new LinkedList<>();
                        temp.add(start);
                        temp.add(end);
                        ret.add(temp);
                    }
                }
            } else {
                if (end - start + 1 >= 3) {
                    List<Integer> temp = new LinkedList<>();
                    temp.add(start);
                    temp.add(end);
                    ret.add(temp);
                }
                start = i;
                end = i;
            }
        }
        
        return ret;
    }
}