// dfs + topo sorting
// AC: Runtime: 28 ms, faster than 8.34% of Java online submissions for Course Schedule.
// Memory Usage: 45 MB, less than 16.13% of Java online submissions for Course Schedule.
// 确定有向图中无环即为 true，否则为 false，课程成环相互依赖无法全部修完
// T:O(m + n), O(m + n), m 为点数，n 为边数
// 
class Solution {
    List<List<Integer>> edges;
    int[] visited;
    boolean flag = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new LinkedList<>();
        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges.add(new LinkedList<>());
        }
        for (int[] arr: prerequisites) {
            edges.get(arr[1]).add(arr[0]);
        }

        for (int i = 0; i < numCourses && flag; i++) {
            if (visited[i] == 0) {
                dfs(i);
                if (!flag) {
                    return flag;
                }
            }
        }

        return flag;
    }

    private void dfs(int i) {
        visited[i] = 1;
        for (int v: edges.get(i)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!flag) {
                    return;
                }
            } else if (visited[v] == 1) {   // 形成环
                flag = false;
                return;
            }
        }

        visited[i] = 2;
    }
}