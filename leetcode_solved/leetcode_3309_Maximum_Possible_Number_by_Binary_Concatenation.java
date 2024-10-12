// Runtime 12 ms Beats 100.00%
// Memory 43.13 MB Beats 100.00%
// Brute-force.
// T:O(n!), S:O(n! * k), k is string length.
// 
class Solution {
    public int maxGoodNumber(int[] nums) {
        String s1 = convertToBinStr(nums[0]), s2 = convertToBinStr(nums[1]), s3 = convertToBinStr(nums[2]);
        String comb1 = s1 + s2 + s3, comb2 = s1 + s3 + s2, comb3 = s2 + s1 + s3, comb4 = s2 + s3 + s1,
                comb5 = s3 + s1 + s2, comb6 = s3 + s2 + s1;
        List<Integer> list1 = new ArrayList<>();
        list1.add(convertStrToBin(comb1));
        list1.add(convertStrToBin(comb2));
        list1.add(convertStrToBin(comb3));
        list1.add(convertStrToBin(comb4));
        list1.add(convertStrToBin(comb5));
        list1.add(convertStrToBin(comb6));
        Collections.sort(list1);

        return list1.get(list1.size() - 1);
    }

    private String convertToBinStr(int num) {
        StringBuilder ret = new StringBuilder();
        while (num > 0) {
            ret.append(num % 2);
            num /= 2;
        }
        return ret.reverse().toString();
    }

    private int convertStrToBin(String num) {
        int ret = 0, base = 1;
        for (int i = num.length() - 1; i >= 0; i--) {
            ret += (num.charAt(i) - '0') * base;
            base *= 2;
        }

        return ret;
    }
}
