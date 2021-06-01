// AC: Runtime: 13 ms, faster than 8.22% of Java online submissions for Maximum Product of Three Numbers.
// Memory Usage: 40.3 MB, less than 66.28% of Java online submissions for Maximum Product of Three Numbers.
// record the largest non-negative and smallest negative, then compare product
// T:O(n), S:O(1)
// 
class Solution {
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }

        PriorityQueue<Integer> nonNega = new PriorityQueue<>();
        PriorityQueue<Integer> negaMin = new PriorityQueue<>();
        PriorityQueue<Integer> negaMax = new PriorityQueue<>();
        for (int i: nums) {
            if (i >= 0) {
                if (nonNega.isEmpty() || i > nonNega.peek() || nonNega.size() < 3) {
                    nonNega.offer(i);
                }
                if (nonNega.size() > 3) {
                    nonNega.poll();
                }
            } else {
                // store the opposite value to get the minimize two number
                if (negaMin.isEmpty() || -i > negaMin.peek() || nonNega.size() < 2) {
                    negaMin.offer(-i);
                }
                if (negaMax.isEmpty() || i > negaMax.peek() || negaMax.size() < 3) {
                    negaMax.offer(i);
                }
                if (negaMin.size() > 2) {
                    negaMin.poll();
                }
                if (negaMax.size() > 3) {
                    negaMax.poll();
                }
            }
        }
        if (nonNega.size() == 0) {
            return negaMax.poll() * negaMax.poll() * negaMax.poll();
        } else if (nonNega.size() == 1) {
            return nonNega.poll() * negaMin.poll() * negaMin.poll();
        } else if (nonNega.size() == 2) {
            nonNega.poll();
            return nonNega.poll() * negaMin.poll() * negaMin.poll();
        } else {
            if (negaMin.size() < 2) {
                return nonNega.poll() * nonNega.poll() * nonNega.poll();
            } else {
                int third = nonNega.poll();
                int second = nonNega.poll();
                int max = nonNega.poll();
                return max * Math.max(third * second, negaMin.poll() * negaMin.poll());
            }
        }
    }
}