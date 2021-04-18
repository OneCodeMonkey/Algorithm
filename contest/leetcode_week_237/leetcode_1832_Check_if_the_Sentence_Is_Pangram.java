// AC
// Runtime: 5 ms, faster than 25.00% of Java online submissions for Check if the Sentence Is Pangram.
// Memory Usage: 39 MB, less than 25.00% of Java online submissions for Check if the Sentence Is Pangram.
class Solution {
    public boolean checkIfPangram(String sentence) {
        int size = sentence.length();
        Map<String, Integer> record = new HashMap<>();
        for(int i = 0; i < size; i++) {
            String temp = String.valueOf(sentence.charAt(i));
            record.merge(temp, 1, Integer::sum);
        }
        return record.size() == 26;
    }
}