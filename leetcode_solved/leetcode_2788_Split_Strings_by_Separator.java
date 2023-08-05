// AC: Runtime 37 ms Beats 5.16% 
// Memory 45.8 MB Beats 6.27%
// Notice: java split() if char is .,|$#@ or other characters, should be convert to escaped characters.
// T:O(n), S:O(n)
// 
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ret = new LinkedList<>();
        String sep = String.valueOf(separator);
        if (!(separator >= 'a' && separator <= 'z')) {
            sep = String.format("\\u%04X", (int) separator);
        }
        for (String word : words) {
            String[] arr = word.split(sep);
            for (String item : arr) {
                if (!item.trim().isEmpty()) {
                    ret.add(item);
                }
            }
        }

        return ret;
    }
}
