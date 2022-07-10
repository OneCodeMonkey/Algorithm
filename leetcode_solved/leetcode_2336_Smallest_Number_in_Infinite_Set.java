// AC: Runtime: 14 ms, faster than 88.89% of Java online submissions for Smallest Number in Infinite Set.
// Memory Usage: 54.8 MB, less than 22.22% of Java online submissions for Smallest Number in Infinite Set.
// using auto-increase pointer and a priorityQueue to restore larger number than current pointer.
// T:O(logn), S:O(n)
// 
class SmallestInfiniteSet {
    PriorityQueue<Integer> added;
    HashSet<Integer> addedSet;
    int current;

    public SmallestInfiniteSet() {
        added = new PriorityQueue<>();
        addedSet = new HashSet<>();
        current = 1;
    }

    public int popSmallest() {
        if (added.isEmpty()) {
            return current++;
        } else {
            int val = added.peek();
            if (val < current) {
                added.poll();
                addedSet.remove(val);
                return val;
            } else {
                return current++;
            }
        }
    }

    public void addBack(int num) {
        if (num < current) {
            if (!addedSet.contains(num)) {
                added.offer(num);
                addedSet.add(num);
            }
        }
    }
}