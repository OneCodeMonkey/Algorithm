// AC:
// Runtime: 13 ms, faster than 10.82% of Java online submissions for Shortest Completing Word.
// Memory Usage: 39.2 MB, less than 79.02% of Java online submissions for Shortest Completing Word.
// 略。
// T:O(n * len(word[i])), S:O(n * len(word[i]))
//
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> record = new HashMap<>();
        int letterCount = 0;
        for (char i: licensePlate.toCharArray()) {
            if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
                letterCount++;
                i = String.valueOf(i).toLowerCase().toCharArray()[0];
                record.merge(i, 1, Integer::sum);
            }
        }
        // 按长度排序
        List<String> wordsList = new LinkedList<>(Arrays.asList(words));
        wordsList.sort((a, b) -> (a.length() - b.length()));

        for (String word: wordsList) {
            if (word.length() >= letterCount) {
                HashMap<Character, Integer> recordTemp = new HashMap<>();
                for (char i: word.toCharArray()) {
                    recordTemp.merge(i, 1, Integer::sum);
                }
                boolean check = true;
                for (char c: record.keySet()) {
                    if (recordTemp.get(c) == null || recordTemp.get(c) < record.get(c)) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    return word;
                }
            }
        }

        return "";
    }
}