// AC: Runtime: 5 ms, faster than 75.99% of Java online submissions for Peeking Iterator.
// Memory Usage: 43.4 MB, less than 6.28% of Java online submissions for Peeking Iterator.
// .
// T:O(1), S:O(n),
//
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private List<Integer> record;
    private int curIndex;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        record = new ArrayList<>();
        while (iterator.hasNext()) {
            record.add(iterator.next());
        }
        curIndex = 0;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return record.get(curIndex);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (curIndex >= record.size()) {
            return null;
        }
        int val = record.get(curIndex);
        curIndex++;
        return val;
    }

    @Override
    public boolean hasNext() {
        return curIndex < record.size();
    }
}