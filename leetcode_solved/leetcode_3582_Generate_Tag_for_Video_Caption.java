// Runtime 5 ms Beats 100.00% 
// Memory 44.50 MB Beats 77.29%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String generateTag(String caption) {
        String[] arr = caption.trim().split(" ");
        StringBuilder ret = new StringBuilder();
        ret.append("#");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim().isEmpty()) {
                continue;
            }
            if (i == 0) {
                ret.append(String.valueOf(arr[i].charAt(0)).toLowerCase()).append(arr[i].substring(1).toLowerCase());
            } else {
                ret.append(String.valueOf(arr[i].charAt(0)).toUpperCase()).append(arr[i].substring(1).toLowerCase());
            }
        }

        return ret.length() > 100 ? ret.substring(0, 100) : ret.toString();
    }
}
