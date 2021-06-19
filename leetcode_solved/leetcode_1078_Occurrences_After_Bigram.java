// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Occurrences After Bigram.
// Memory Usage: 37.4 MB, less than 40.18% of Java online submissions for Occurrences After Bigram.
// .
// T:O(n), S:O(n)
//
lass Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strArr = text.split(" ");
        if (strArr.length < 3) {
            return new String[0];
        }
        List<String> ret = new LinkedList<>();
        for (int i = 2; i < strArr.length; i++) {
            if (strArr[i - 2].equals(first) && strArr[i - 1].equals(second)) {
                ret.add(strArr[i]);
            }
        }
        String[] retArr = new String[ret.size()];
        int pos = 0;
        for (String str: ret) {
            retArr[pos++] = str;
        }

        return retArr;
    }
}