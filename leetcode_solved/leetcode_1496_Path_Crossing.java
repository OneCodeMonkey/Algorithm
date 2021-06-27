// AC: Runtime: 4 ms, faster than 64.37% of Java online submissions for Path Crossing.
// Memory Usage: 39.2 MB, less than 21.87% of Java online submissions for Path Crossing.
// .
// T:O(len(path)), S:O(len(path))
// 
class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> passed = new HashSet<>();
        int x = 0, y = 0;
        passed.add(x + "#" + y);
        for (char c: path.toCharArray()) {
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
            }
            String pos = x + "#" + y;
            if (passed.contains(pos)) {
                return true;
            }
            passed.add(pos);
        }

        return false;
    }
}