// AC: T:O(n) S:O(n)
// Runtime: 2 ms, faster than 100.00% of Java online submissions for Number of Different Integers in a String.
// Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Number of Different Integers in a String.
// 
// 注意坑：
// 1.里面说包含 Integer,但没说 integer 范围，所以去重时不要用 int 去存结果，会溢出。
// 2.字符串表示时数字位大于等于两位时，要去掉头部的0
// 
class Solution {
    public int numDifferentIntegers(String word) {
        int size = word.length();
        int aAscii = 'a';
        int zAscii = 'z';
        int zeroAscii = '0';
        HashSet<String> record = new HashSet<>();
        for(int i = aAscii; i <= zAscii; i++) {
            word = word.replace((char) i, ' ');
        }
        String[] ret = word.split(" ");
        for (String item: ret) {
            if (item.isEmpty()) {
                continue;
            }
            // 去除头部0
            int pos = 0;
            while(item.charAt(pos) == zeroAscii && item.length() >= 2) {
                item = item.substring(1);
            }
            record.add(item);
        }

        return record.size();
    }
}