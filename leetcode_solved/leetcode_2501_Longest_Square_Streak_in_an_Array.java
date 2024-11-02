// Runtime 58 ms Beats 28.13%
// Memory 59.69 MB Beats 60.42%
// Sort & hashset.
// T:O(n), S:O(n)
// 
class Solution {
    public int longestSquareStreak(int[] nums) {
        int ret = -1;
        List<Integer> squares = new ArrayList<>();
        for (int num : nums) {
            int sqrtN = (int) Math.sqrt(num);
            if (sqrtN * sqrtN == num) {
                squares.add(num);
            }
        }
        if (squares.isEmpty()) {
            return ret;
        }
        HashSet<Integer> original = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new)),
                usedSquares = new HashSet<>();
        squares.sort((a, b) -> b - a);
        int pos = 0;
        while (!squares.isEmpty()) {
            int start = -1, cur = 1;
            for (int i = pos; i < squares.size(); i++) {
                if (!usedSquares.contains(squares.get(i))) {
                    start = squares.get(i);
                    pos = i + 1;
                    break;
                }
            }
            if (start == -1) {
                break;
            }

            usedSquares.add(start);
            while (true) {
                int sqrtN = (int) Math.sqrt(start);
                if (sqrtN * sqrtN != start || !original.contains(sqrtN)) {
                    break;
                }
                start = sqrtN;
                cur++;
                usedSquares.add(start);
            }
            if (cur > 1) {
                ret = Math.max(ret, cur);
            }
        }

        return ret;
    }
}
