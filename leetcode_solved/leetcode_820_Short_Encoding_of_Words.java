// AC: Runtime 666 ms Beats 5.56%
// Memory 43.9 MB Beats 72.22%
// Brute-force & HashSet
// T:O(n ^ 2), S:O(n)
// 
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        HashSet<String> record = new HashSet<>();
        for (String word : words) {
            boolean isSuffix = false;
            for (String item : record) {
                if (item.endsWith(word)) {
                    isSuffix = true;
                    break;
                }
            }
            if (!isSuffix) {
                record.add(word);
            }
        }

        int ret = 0;
        for (String item : record) {
            ret += item.length() + 1;
        }

        return ret;
    }
}
