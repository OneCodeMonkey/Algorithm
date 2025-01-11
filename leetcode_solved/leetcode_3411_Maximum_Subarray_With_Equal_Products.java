// Runtime 1 ms Beats 100.00% 
// Memory 42.53 MB Beats -%
// Math theory: 1. First can prove 2-length array are always ok. 2.The right subarray is that from the 
//     third items to the last, the items can not have common factor i > 1 to the lcm(n1, n2, .., ni) 
// T:O(n^2 * logn), S:O(1)
// 
class Solution {
    public int maxLength(int[] nums) {
        int len = nums.length, ret = 2;
        for (int i = 0; i < len - 1; i++) {
            int lcm1 = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (nums[j] > 1 && gcd(lcm1, nums[j]) > 1) {
                    break;
                }
                ret = Math.max(ret, j - i + 1);
                lcm1 = lcm(lcm1, nums[j]);
//                System.out.println("lcm: " + lcm1 + " - ret: " + ret);
            }
        }

        return ret;
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }
}
