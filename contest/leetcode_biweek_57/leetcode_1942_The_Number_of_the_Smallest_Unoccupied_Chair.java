class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int peopleNum = times.length;
        int targetComeTime = times[targetFriend][0], targetLeaveTime = times[targetFriend][1];
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<Integer> chairs = new ArrayList<>();

        for (int i = 0; i < peopleNum; i++) {
            int comeTime = times[i][0], leaveTime = times[i][1];
            // 清理 leave
            List<Integer> toRemoveIndex = new LinkedList<>();
            for (int j = 0; j < chairs.size(); j++) {
                if (chairs.get(j) <= comeTime) {
                    toRemoveIndex.add(j);
                }
            }
            for (int toRemove: toRemoveIndex) {
                chairs.set(toRemove, 0);
            }

            int canSitIndex = -1;
            for (int j = 0; j < chairs.size(); j++) {
                if (chairs.get(j) == 0) {
                    canSitIndex = j;
                    break;
                }
            }
            if (canSitIndex == -1) {
                chairs.add(leaveTime);
                if (comeTime == targetComeTime && leaveTime == targetLeaveTime) {
                    return chairs.size() - 1;
                }
            } else {
                chairs.set(canSitIndex, leaveTime);
                if (comeTime == targetComeTime && leaveTime == targetLeaveTime) {
                    return canSitIndex;
                }
            }
        }

        return -1;
    }
}