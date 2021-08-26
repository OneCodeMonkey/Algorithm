// AC:
// Runtime: 2056 ms, faster than 50.00% of Java online submissions for Rotating the Box.
// Memory Usage: 64.7 MB, less than 100.00% of Java online submissions for Rotating the Box.
// my thought: using string split(obstacle), and combine every part to make stone fall down.
// complexity: T:O(m * n), S:O(m * n)
// 
class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length, col = box[0].length;
        char[][] ret = new char[col][row];
        List<List<Character>> record = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            // 逐行下落
            List<Character> temp = new LinkedList<>();
            StringBuilder tempStr = new StringBuilder();
            for (int j = 0; j <= col - 1; j++) {
                tempStr.append(box[i][j]);
            }
            tempStr.append("#");
            String[] tempArr = tempStr.toString().split("\\*");
            if (tempArr.length == 0) {
                for (int t = 0; t < tempStr.length(); t++) {
                    temp.add('*');
                }
            } else {
                for (String part : tempArr) {
                    if (part.isEmpty()) {
                        temp.add('*');
                        continue;
                    }
                    int countEmpty = 0, countStone = 0;
                    for (char item : part.toCharArray()) {
                        if (item == '#') {
                            countStone++;
                        }
                        if (item == '.') {
                            countEmpty++;
                        }
                    }
                    for (int k = 0; k < countEmpty; k++) {
                        temp.add('.');
                    }
                    for (int k = 0; k < countStone; k++) {
                        temp.add('#');
                    }

                    temp.add('*');
                }
                // 去除末尾 *
                if (temp.get(temp.size() - 1) == '*') {
                    temp.remove(temp.size() - 1);
                }
            }
            temp.remove(temp.size() - 1);
            record.add(temp);
        }
        // rotate
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ret[i][j] = record.get(row - 1 - j).get(i);
            }
        }

        return ret;
    }
}