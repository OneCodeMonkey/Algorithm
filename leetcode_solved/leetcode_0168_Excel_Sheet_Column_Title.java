// AC： Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
// Memory Usage: 36 MB, less than 80.86% of Java online submissions for Excel Sheet Column Title.
// 注意当 n % 26 == 0 时，在字符串表示里是不进位的，而是低位用 Z，高位减 1
// T:O(n), S:O(1)
// 
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ret = new StringBuilder();
        while (columnNumber > 0) {
            int index = columnNumber % 26;
            char temp;
            // 避坑！
            boolean hasZ = false;
            
            if (index == 0) {
                temp = 'Z';
                hasZ = true;
            } else {
                temp = (char)(index - 1 + 'A');
            }
            ret.append(temp);
            columnNumber /= 26;
            if (hasZ) {
                columnNumber -= 1;
            }
        }

        return ret.reverse().toString();
    }
}
