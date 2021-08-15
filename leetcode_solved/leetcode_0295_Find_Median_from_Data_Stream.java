// AC: Runtime: 210 ms, faster than 9.73% of Java online submissions for Find Median from Data Stream.
// Memory Usage: 123.5 MB, less than 6.09% of Java online submissions for Find Median from Data Stream.
// two heap, one is minimum heap, one is maximum heap, keep the size balance, so the top of the two heap makeup median number.
// add: T:O(logn), find: T:O(1),  S:O(n)
// 
class MedianFinder {
    private PriorityQueue<Integer> record1;
    private PriorityQueue<Integer> record2;
    private boolean isEvenSize = true;

    /** initialize your data structure here. */
    public MedianFinder() {
        record1 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        record2 = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (isEvenSize) {
            record2.offer(num);
            record1.offer(record2.poll());
        } else {
            record1.offer(num);
            record2.offer(record1.poll());
        }
        isEvenSize = !isEvenSize;
    }

    public double findMedian() {
        if (record2.isEmpty()) {
            return record1.peek();
        }
        if (isEvenSize) {
            return (record1.peek() + record2.peek()) / 2.0;
        } else {
            return record1.peek();
        }
    }
}