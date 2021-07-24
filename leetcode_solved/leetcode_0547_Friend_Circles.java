// AC: Runtime: 4 ms, faster than 26.16% of Java online submissions for Number of Provinces.
// Memory Usage: 39.7 MB, less than 74.85% of Java online submissions for Number of Provinces.
// search forwarding
// T:O(n^2), S:O(n)
// 
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int size  = isConnected.length;
        List<HashSet<Integer>> record = new ArrayList<>();
        // record the index of element which are in record.
        HashMap<Integer, Integer> recordIndex = new HashMap<>();
        boolean[] searched = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (searched[i]) {
                continue;
            }
            List<Integer> connected = new LinkedList<>();
            for (int j = 0; j < size; j++) {
                if (isConnected[i][j] == 1) {
                    if (i != j) {
                        connected.add(j);
                    }

                    Integer index = recordIndex.get(i);
                    if (index != null) {
                        record.get(index).add(j);
                        recordIndex.put(j, index);
                    } else {
                        HashSet<Integer> temp = new HashSet<>();
                        temp.add(i);
                        temp.add(j);
                        record.add(temp);
                        recordIndex.put(i, record.size() - 1);
                        recordIndex.put(j, record.size() - 1);
                    }
                }
            }
            // search connected forward
            while (connected.size() > 0) {
                List<Integer> connectedNew = new LinkedList<>();
                for (int row: connected) {
                    for (int j = 0; j < size; j++) {
                        if (isConnected[row][j] == 1) {
                            int index = recordIndex.get(i);
                            if (!record.get(index).contains(j)) {
                                record.get(index).add(j);
                                recordIndex.put(j, index);
                                if (!searched[j]) {
                                    connectedNew.add(j);
                                }
                            }
                        }
                    }
                    searched[row] = true;
                }
                connected = connectedNew;
            }

            searched[i] = true;
        }

        return record.size();
    }
}