// AC: Runtime: 1 ms, faster than 63.34% of Java online submissions for Custom Sort String.
// Memory Usage: 36.9 MB, less than 83.59% of Java online submissions for Custom Sort String.
// thought:convert char to int, then sort. Notice that characters that not appear in order can be 
//     assigned a number > 26, for example, convert to int directly.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public String customSortString(String order, String str) {
        int[] charToInt = new int[26], intToChar = new int[26];
        for (int i = 0; i < 26; i++) {
            charToInt[i] = -1;
            intToChar[i] = -1;
        }
        for (int i = 0; i < order.length(); i++) {
            int temp = order.charAt(i) - 'a';
            charToInt[temp] = i;
            intToChar[i] = temp;
        }

        int[] strArr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int temp= charToInt[str.charAt(i) - 'a'];
            strArr[i] = temp == -1 ? str.charAt(i) : temp;
        }
        Arrays.sort(strArr);
        StringBuilder ret = new StringBuilder();
        for (int i: strArr) {
            if (i < 26) {
                ret.append((char)(intToChar[i] + 'a'));
            } else {
                ret.append((char)i);
            }
        }

        return ret.toString();
    }
}