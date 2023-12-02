// AC: Runtime 2 ms Beats 100.00% of users with Java
// Memory 44.22 MB Beats 50.00% of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                ret.add(i);
            }
        }

        return ret;
    }
}
