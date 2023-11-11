// AC: Runtime Details 122ms Beats 7.58%of users with Java
// Memory Details 95.78MB Beats 5.94%of users with Java
// Data structure design.
// T:init: O(n), add & remove: O(logn),  S:O(n)
// 
class SeatManager {
    private TreeMap<Integer, Boolean> record;

    public SeatManager(int n) {
        record = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            record.put(i, true);
        }
    }

    public int reserve() {
        int seatNumber = record.firstKey();
        record.remove(seatNumber);
        return seatNumber;
    }

    public void unreserve(int seatNumber) {
        record.put(seatNumber, true);
    }
}
/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
