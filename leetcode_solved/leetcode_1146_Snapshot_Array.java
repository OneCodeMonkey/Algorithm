// AC: Runtime 71 ms Beats 38.57% 
// Memory 89.3 MB Beats 9.43%
// Using a TreeMap array to restore every element's change set.
// T:O(logn), S:O(n + m), m is set times.
// 
class SnapshotArray {
    int snapVersion = 0;
    List<TreeMap<Integer, Integer>> versionsOfElements;

    public SnapshotArray(int length) {
        versionsOfElements = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            versionsOfElements.add(new TreeMap<>());
            versionsOfElements.get(i).put(0, 0);
        }
    }

    public void set(int index, int val) {
        versionsOfElements.get(index).put(snapVersion, val);
    }

    public int snap() {
        return snapVersion++;
    }

    public int get(int index, int snap_id) {
        return versionsOfElements.get(index).floorEntry(snap_id).getValue();
    }
}
