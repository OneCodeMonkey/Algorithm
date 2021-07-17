// AC: Runtime: 4 ms, faster than 15.03% of Java online submissions for Keys and Rooms.
// Memory Usage: 38.5 MB, less than 98.13% of Java online submissions for Keys and Rooms.
// straight forward.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        HashSet<Integer> traveled = new HashSet<>(), canAccess = new HashSet<>();
        List<Integer> remain = new LinkedList<>();
        for (int i: rooms.get(0)) {
            remain.add(i);
            canAccess.add(i);
        }
        canAccess.add(0);
        traveled.add(0);
        if (canAccess.size() == size) {
            return true;
        }
        while (!remain.isEmpty()) {
            List<Integer> temp = new LinkedList<>(remain);
            for (int i: temp) {
                if (traveled.contains(i)) {
                    continue;
                }
                for (int j: rooms.get(i)) {
                    canAccess.add(j);
                    remain.add(j);
                }
                traveled.add(i);
            }
            for (int i: temp) {
                Integer tempI = i;
                remain.remove(tempI);
            }
        }

        return canAccess.size() == size;
    }
}