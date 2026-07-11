// Runtime 327 ms Beats 6.37% 
// Memory 259.82 MB Beats 5.01%
// Max heap & map.
// T:O(n) ~O(nlogn), S:O(n)
// 
class EventManager {
    HashMap<Integer, Integer> record = new HashMap<>();
    TreeMap<Integer, TreeMap<Integer, Integer>> eventRecord = new TreeMap<>((o1, o2) -> o2 - o1);

    public EventManager(int[][] events) {
        for (int[] event : events) {
            record.put(event[0], event[1]);

            eventRecord.putIfAbsent(event[1], new TreeMap<>());
            eventRecord.get(event[1]).put(event[0], event[1]);
        }
    }

    public void updatePriority(int eventId, int newPriority) {
        if (!record.containsKey(eventId)) {
            return;
        }
        int priority = record.get(eventId);
        eventRecord.get(priority).remove(eventId);
        if (eventRecord.get(priority).size() == 0) {
            eventRecord.remove(priority);
        }
        eventRecord.putIfAbsent(newPriority, new TreeMap<>());
        eventRecord.get(newPriority).put(eventId, newPriority);

        record.put(eventId, newPriority);
    }

    public int pollHighest() {
        if (record.size() == 0) {
            return -1;
        }
        int ret = -1, priorityVal = -1;
        for (int priority : eventRecord.keySet()) {
            for (int eventId : eventRecord.get(priority).keySet()) {
                ret = eventId;
                priorityVal = priority;
                break;
            }
            if (ret != -1) {
                break;
            }
        }
        record.remove(ret);
        eventRecord.get(priorityVal).remove(ret);
        if (eventRecord.get(priorityVal).size() == 0) {
            eventRecord.remove(priorityVal);
        }

        return ret;
    }
}