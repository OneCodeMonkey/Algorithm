// AC: Runtime 3 ms Beats 33.33% 
// Memory 43.4 MB Beats 33.33%
// Set.
// T:O(n), S:O(n)
// 
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ret = 0;
        Set<String> record = new HashSet<>();
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            if (record.contains(reverse)) {
                ret++;
            }
            record.add(word);
        }

        return ret;
    }
}
