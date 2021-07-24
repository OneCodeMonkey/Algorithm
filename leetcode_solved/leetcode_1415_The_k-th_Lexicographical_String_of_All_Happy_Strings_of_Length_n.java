// AC: Runtime: 1 ms, faster than 98.85% of Java online submissions for The k-th Lexicographical String of All Happy Strings of Length n.
// Memory Usage: 36.4 MB, less than 91.92% of Java online submissions for The k-th Lexicographical String of All Happy Strings of Length n.
// Record the change bit' index, and construct the result from 0-index
// T:O(n), S:O(logn)
// 
class Solution {
    public String getHappyString(int n, int k) {
        int total = 3 * (int) Math.pow(2, n - 1);
        if (k > total) {
            return "";
        }
        // record the bit from end to start that have to rise on the base of its original char, for example, 'a' -> 'b',  'b' -> 'c'
        k = k - 1;
        int exp = 1;
        List<Integer> expIndex = new LinkedList<>();
        while (k > 0) {
            int modRemain = k % 2;
            if (modRemain == 1) {
                expIndex.add(exp);
            }
            k /= 2;
            exp++;
        }
        
        int inserted = expIndex.size() - 1;
        StringBuilder ret = new StringBuilder();
        char lastChar = ' ', c;
        for (int i = 0; i < n; i++) {
            if (inserted >= 0 && expIndex.get(inserted) == n + 1) {
                inserted--;
                lastChar = 'c';
                ret.append(lastChar);
                continue;
            }
            if (inserted >= 0 && i == n - expIndex.get(inserted)) {
                if (i == 0) {
                    c = 'b';
                } else {
                    if (lastChar == 'a' || lastChar == 'b') {
                        c = 'c';
                    } else {
                        c = 'b';
                    }
                }
                inserted--;
            } else {
                if (i == 0) {
                    c = 'a';
                } else {
                    if (lastChar == 'b' || lastChar == 'c') {
                        c = 'a';
                    } else {
                        c = 'b';
                    }
                }
            }
            lastChar = c;
            ret.append(lastChar);
        }

        return ret.toString();
    }
}