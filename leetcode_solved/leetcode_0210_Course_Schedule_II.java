// AC: Runtime: 32 ms, faster than 7.23% of Java online submissions for Course Schedule II.
// Memory Usage: 40.4 MB, less than 42.70% of Java online submissions for Course Schedule II.
// topo sort, using two hashmap, one store node's indegree, one store nodes' child list.
// T:O(n^3), S:O(n) ~ O(n^2)
// 
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return new int[0];
        }
        // 1.init map
        HashMap<Integer, Integer> inDegree = new HashMap<>();
        HashMap<Integer, List<Integer>> topoMap = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            inDegree.put(i, 0);
            topoMap.put(i, new LinkedList<>());
        }

        // 2.build map
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0], preCourse = prerequisite[1];
            topoMap.get(preCourse).add(course);
            inDegree.merge(course, 1, Integer::sum);
        }

        // 3-5 travel all nodes
        int[] ret = new int[numCourses];
        int pos = 0;
        while (!inDegree.isEmpty()) {
            boolean flag = false;
            for (int key: inDegree.keySet()) {
                // 3.find 0-indegree node.
                if (inDegree.get(key) == 0) {
                    flag = true;
                    ret[pos++] = key;
                    // 4.remove child
                    for (int child: topoMap.get(key)) {
                        inDegree.merge(child, -1, Integer::sum);
                    }
                    // 5.remove node
                    inDegree.remove(key);
                    break;
                }
            }
            // 不为空且不存在入度为 0 的点，则一定存在环，就不存在满足的拓扑排序。
            if (!flag) {
                return new int[0];
            }
        }

        return ret;
    }
}