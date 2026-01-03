// Runtime 59 ms Beats 100% 
// Memory 65.13 MB Beats 100%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String reverseWords(String s) {
        int count = 0;
        String[] arr = s.split(" ");
        char[] vol = new char[]{'a', 'e', 'i', 'o', 'u'};
        if (arr.length == 1) {
            return s;
        }
        for (char c : arr[0].toCharArray()) {
            boolean flag = false;
            for (char c1 : vol) {
                if (c1 == c) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        StringBuilder ret = new StringBuilder(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int count1 = 0;
            for (char c : arr[i].toCharArray()) {
                boolean flag = false;
                for (char c1 : vol) {
                    if (c1 == c) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    count1++;
                }
            }

            if (count1 == count) {
                ret.append(" ").append(new StringBuilder(arr[i]).reverse().toString());
            } else {
                ret.append(" ").append(arr[i]);
            }
        }

        return ret.toString();
    }
}
