// untime 81 ms Beats 5.11% 
// Memory 47.20 MB Beats 73.18%
// Sort.
// T:O(nlogn * logk), S:O(n)
// 
class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> {
            int binaryA = getBinaryRever((int) a), binaryB = getBinaryRever((int) b);
            return (binaryA == binaryB) ? (a - b) : (binaryA - binaryB);
        });
        int[] ret = new int[arr.length];
        int pos = 0;
        for (int i : arr) {
            ret[pos++] = i;
        }

        return ret;
    }

    private static int getBinaryRever(int i) {
        StringBuilder b = new StringBuilder();
        boolean skipZero = false;
        while (i > 0) {
            int digit = i % 2;
            if (!skipZero) {
                if (digit > 0) {
                    skipZero = true;
                    b.append(digit);
                }
            } else {
                b.append(digit);
            }
            i /= 2;
        }
        int ret = 0, exp = 1;
        String b1 = b.reverse().toString();
        for (int j = 0; j < b1.length(); j++) {
            ret += (b1.charAt(j) == '1' ? 1 : 0) * exp;
            exp *= 2;
        }

        return ret;
    }
}
