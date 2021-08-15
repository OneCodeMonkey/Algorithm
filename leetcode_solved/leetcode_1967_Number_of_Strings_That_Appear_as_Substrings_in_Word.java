class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ret = 0;
        for (String str: patterns) {
            if (word.contains(str)) {
                ret++;
            }
        }

        return ret;
    }
}