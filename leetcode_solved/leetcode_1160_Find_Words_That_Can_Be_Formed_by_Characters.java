// AC: Runtime: 19 ms, faster than 43.04% of Java online submissions for Find Words That Can Be Formed by Characters.
// Memory Usage: 39.9 MB, less than 25.38% of Java online submissions for Find Words That Can Be Formed by Characters.
// using hashmap to record character occurrence times.
// T:O(m * strlen(words[i])), S:O(max(words[i]))
// 
class Solution {
    public int countCharacters(String[] words, String chars) {
        int size = words.length, charsLen = chars.length(), ret = 0;
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c: chars.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }

        for (String str: words) {
            if (str.length() <= charsLen) {
                HashMap<Character, Integer> temp = new HashMap<>();
                for (char c: str.toCharArray()) {
                    temp.merge(c, 1, Integer::sum);
                }
                boolean flag = true;
                for (char c: temp.keySet()) {
                    if (!record.containsKey(c) || record.get(c) < temp.get(c)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ret += str.length();
                }
            }
        }

        return ret;
    }
}