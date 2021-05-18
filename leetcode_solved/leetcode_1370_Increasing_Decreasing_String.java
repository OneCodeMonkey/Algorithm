// 1.朴素-暴力解法
// Runtime: 1 ms, faster than 99.69% of Java online submissions for Self Dividing Numbers.
// Memory Usage: 36.1 MB, less than 99.23% of Java online submissions for Self Dividing Numbers.
// 简单思路：模拟每一次拼接的过程
// 复杂度：T：O(n^2), S：O(n)
class Solution {
    public String sortString(String s) {
        StringBuilder ret = new StringBuilder();
        List<Character> record = new LinkedList<>();
        char[] loop = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        for (int i = 0; i < s.length(); i++) {
            record.add(s.charAt(i));
        }
        int pos = 0;
        while (!record.isEmpty()) {
            int index = pos % 52;
            if (record.contains(loop[index])) {
                ret.append(loop[index]);
                record.remove(record.indexOf(loop[index]));
            }
            pos++;
        }
        return ret.toString();
    }
}

// 2.优化
