// AC: Runtime: 10 ms, faster than 36.55% of Java online submissions for Letter Case Permutation.
// Memory Usage: 54.3 MB, less than 12.85% of Java online submissions for Letter Case Permutation.
// backtracking.
// T:O(2^n), S:O(2^n * m), m = s.length, n is alphabet char of s.
// 
class Solution {
    HashSet<String> record = new HashSet<>();

    public List<String> letterCasePermutation(String s) {
        List<Integer> indexes = new ArrayList<>();
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (!(sArr[i] >= '0' && sArr[i] <= '9')) {
                indexes.add(i);
            }
        }
        if (indexes.isEmpty()) {
            record.add(s);
        } else {
            backtracking(s.toCharArray(), record, indexes, 0);
        }

        return new LinkedList<>(record);
    }

    private void backtracking(char[] curStr, HashSet<String> out, List<Integer> indexes, int index) {
        if (index >= indexes.size()) {
            return;
        }
        int changeIndex = indexes.get(index);

        // no change
        char[] copy = new char[curStr.length];
        System.arraycopy(curStr, 0, copy, 0, curStr.length);
        out.add(new String(copy));
        backtracking(copy, out, indexes, index + 1);

        // change to opposite case, for example, uppercase to lowercase, or lowercase to uppercase.
        char c = curStr[changeIndex];
        curStr[changeIndex] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        System.arraycopy(curStr, 0, copy, 0, curStr.length);
        out.add(new String(copy));
        backtracking(copy, out, indexes, index + 1);
    }
}