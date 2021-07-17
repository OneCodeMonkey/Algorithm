// AC: Runtime: 2 ms, faster than 98.47% of Java online submissions for Reveal Cards In Increasing Order.
// Memory Usage: 39.3 MB, less than 48.16% of Java online submissions for Reveal Cards In Increasing Order.
// Using a two-direction queue to get the output indexes order list, then set the index to the sorted array value step by step.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int size = deck.length;
        Arrays.sort(deck);
        int[] ret = new int[size];
        Deque<Integer> record = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            // insert to tail, then pollFirst() will get the smallest first.
            record.addLast(i);
        }
        int pos = 0;
        while (!record.isEmpty()) {
            ret[record.pollFirst()] = deck[pos++];
            if (record.isEmpty()) {
                break;
            }
            record.addLast(record.pollFirst());
        }

        return ret;
    }
}