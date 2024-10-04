// Solution 1: Brute-force.
// Runtime 63 ms Beats 37.36%
// Memory 45.23 MB Beats 81.32%
// Brute-force: Check every segment.
// T:O(n^2), S:O(n)
// 
class MyCalendar {
    private List<int[]> record;

    public MyCalendar() {
        record = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] item : record) {
            if (Math.max(item[0], start) < Math.min(item[1], end)) {
                return false;
            }
        }
        record.add(new int[]{start, end});

        return true;
    }
}


// Solution 2: 