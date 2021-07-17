// AC: Runtime: 30 ms, faster than 43.60% of Java online submissions for Maximum Frequency Stack.
// Memory Usage: 47.8 MB, less than 87.61% of Java online submissions for Maximum Frequency Stack.
// using a hashmap to record element occurence times, a hashmap to record time and stack which record elements' come-in orders.
// T:O(1), S:O(1)
// 
class FreqStack {
    private HashMap<Integer, Stack<Integer>> record;
    private HashMap<Integer, Integer> timeRecord;
    private int maxFreq;

    public FreqStack() {
        record = new HashMap<>();
        timeRecord = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        timeRecord.merge(val, 1, Integer::sum);
        maxFreq = Math.max(maxFreq, timeRecord.get(val));
        int curTime = timeRecord.get(val);
        if (record.get(curTime) != null) {
            record.get(curTime).push(val);
        } else {
            Stack<Integer> tempStack = new Stack<>();
            tempStack.push(val);
            record.put(curTime, tempStack);
        }
    }

    public int pop() {
        int top = record.get(maxFreq).peek();
        record.get(maxFreq).pop();
        timeRecord.merge(top, -1, Integer::sum);
        if (record.get(maxFreq).empty()) {
            maxFreq--;
        }

        return top;
    }
}