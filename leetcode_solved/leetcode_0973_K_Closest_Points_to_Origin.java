// AC: Runtime: 77 ms, faster than 5.95% of Java online submissions for K Closest Points to Origin.
// Memory Usage: 48.4 MB, less than 30.59% of Java online submissions for K Closest Points to Origin.
// using treemap to sort distances.
// T:O(n), S:O(n)
// 
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int size = points.length;
        int[][] ret = new int[k][2];
        TreeMap<Integer, List<String>> distRecord = new TreeMap<>();
        for (int[] point: points) {
            int distSquare = point[0] * point[0] + point[1] * point[1];
            String temp = point[0] + "#" + point[1];
            if (distRecord.get(distSquare) != null) {
                distRecord.get(distSquare).add(temp);
            } else {
                List<String> tempList = new LinkedList<>();
                tempList.add(temp);
                distRecord.put(distSquare, tempList);
            }
        }

        int pos = 0;
        for (int distSquare: distRecord.keySet()) {
            for (String str: distRecord.get(distSquare)) {
                String[] arr = str.split("#");
                ret[pos][0] = Integer.parseInt(arr[0]);
                ret[pos][1] = Integer.parseInt(arr[1]);
                pos++;
                if (pos >= k) {
                    return ret;
                }
            }
        }

        return ret;
    }
}