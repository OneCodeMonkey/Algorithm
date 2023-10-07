// AC: Runtime 47 ms Beats 100%
// Memory 124.3 MB Beats 36.4%
// HashMap & minimum Heap.
// T: add: O(logn) ~ O(n), find: O(1),  S:O(n)
// 
class NumberContainers {
    HashMap<Integer, PriorityQueue<Integer>> elementToIndexes;
    HashMap<Integer, Integer> elementToIndex;

    public NumberContainers() {
        elementToIndexes = new HashMap<>();
        elementToIndex = new HashMap<>();
    }

    public void change(int index, int number) {
        if (elementToIndex.containsKey(index)) {
            if (elementToIndex.get(index) != number) {
                int originalElem = elementToIndex.get(index);
                elementToIndexes.get(originalElem).remove(index);
                if (elementToIndexes.get(originalElem).isEmpty()) {
                    elementToIndexes.remove(originalElem);
                }

                if (elementToIndexes.containsKey(number)) {
                    elementToIndexes.get(number).add(index);
                } else {
                    PriorityQueue<Integer> tmpHeap = new PriorityQueue<>();
                    tmpHeap.add(index);
                    elementToIndexes.put(number, tmpHeap);
                }

                elementToIndex.put(index, number);
            }
        } else {
            if (elementToIndexes.containsKey(number)) {
                elementToIndexes.get(number).add(index);
            } else {
                PriorityQueue<Integer> tmpHeap = new PriorityQueue<>();
                tmpHeap.add(index);
                elementToIndexes.put(number, tmpHeap);
            }
            elementToIndex.put(index, number);
        }
    }

    public int find(int number) {
        if (elementToIndexes.containsKey(number)) {
            return elementToIndexes.get(number).peek();
        }

        return -1;
    }
}
