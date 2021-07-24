// AC: Runtime: 82 ms, faster than 32.78% of Java online submissions for Shuffle an Array.
// Memory Usage: 47.1 MB, less than 85.01% of Java online submissions for Shuffle an Array.
// do n-times pick random element to the front of the array.
// T:O(n), S:O(1)
// 
class Solution {
    private int[] original;
    private List<Integer> shuffled;

    public Solution(int[] nums) {
        original = new int[nums.length];
        System.arraycopy(nums, 0, original, 0, nums.length);
        shuffled = new LinkedList<>();
        for (int i: nums) {
            shuffled.add(i);
        }
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int size = original.length;
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int randIndex = rand.nextInt(size);
            shuffled.add(0, shuffled.remove(randIndex));
        }

        int[] ret = new int[size];
        int pos = 0;
        for (int i: shuffled) {
            ret[pos++] = i;
        }

        return ret;
    }
}