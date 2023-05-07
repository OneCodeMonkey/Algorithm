// AC: Runtime 56 ms Beats 75% 
// Memory 108.5 MB Beats 25%
// Hashmap
// T:O(1), S:O(n)
// 
class FrequencyTracker {
    HashMap<Integer, Integer> valToTimes, timeToVal;

    public FrequencyTracker() {
        valToTimes = new HashMap<>();
        timeToVal = new HashMap<>();
    }

    public void add(int number) {
        int originalTime = valToTimes.getOrDefault(number, 0);
        valToTimes.merge(number, 1, Integer::sum);
        if (timeToVal.containsKey(originalTime)) {
            if (timeToVal.get(originalTime) == 1) {
                timeToVal.remove(originalTime);
            } else {
                timeToVal.merge(originalTime, -1, Integer::sum);
            }
        }
        timeToVal.merge(originalTime + 1, 1, Integer::sum);
    }

    public void deleteOne(int number) {
        if (!valToTimes.containsKey(number)) {
            return;
        }
        int originalTime = valToTimes.get(number);
        if (originalTime == 1) {
            valToTimes.remove(number);
        } else {
            valToTimes.merge(number, -1, Integer::sum);
        }
        if (timeToVal.get(originalTime) == 1) {
            timeToVal.remove(originalTime);
        } else {
            timeToVal.merge(originalTime, -1, Integer::sum);
        }
        timeToVal.merge(originalTime - 1, 1, Integer::sum);
    }

    public boolean hasFrequency(int frequency) {
        return timeToVal.containsKey(frequency);
    }
}
