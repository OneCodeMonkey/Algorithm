// Runtime 61 ms Beats 100.00% of users with Java
// Memory 99.61 MB Beats 100.00% of users with Java
// Sort And get all dis-joint continous segment.
// T:O(nlogn), S:(n)
// 
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] != b[0] ? (a[0] - b[0]) : (a[1] != b[1] ? (a[1] - b[1]) : 0));
        List<List<Integer>> segment = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (segment.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                list.add(meeting[0]);
                list.add(meeting[1]);
                segment.add(list);
            } else {
                List<Integer> list = segment.get(segment.size() - 1);
                if (meeting[0] == list.get(1)) {
                    list.set(1, meeting[1]);
                } else if (meeting[0] < list.get(1)) {
                    if (meeting[1] > list.get(1)) {
                        list.set(1, meeting[1]);
                    }
                } else {
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(meeting[0]);
                    list2.add(meeting[1]);
                    segment.add(list2);
                }
            }
        }
        int count = 0;
        for (List<Integer> segmentItem : segment) {
            count += segmentItem.get(1) - segmentItem.get(0) + 1;
        }

        return days - count;
    }
}
