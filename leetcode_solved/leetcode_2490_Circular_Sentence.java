// Time: Runtime 3 ms Beats 60% 
// Memory 42.4 MB Beats 100%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
                return false;
            }
        }
        if (arr[0].charAt(0) != arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1)) {
            return false;
        }

        return true;
    }
}
