// AC: Runtime: 7 ms, faster than 18.22% of Java online submissions for Employee Importance.
// Memory Usage: 39.9 MB, less than 95.33% of Java online submissions for Employee Importance.
// using hashmap restore middle results.
// T:O(n), S:O(n), n is the list length.
// 
/*
// Employee info
class Employee {
public:
    // It's the unique ID of each node.
    // unique id of this employee
    int id;
    // the importance value of this employee
    int importance;
    // the id of direct subordinates
    vector<int> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Integer> employToValue = new HashMap<>();
        HashMap<Integer, List<Integer>> idToPeople = new HashMap<>();
        for (Employee e : employees) {
            employToValue.put(e.id, e.importance);
            if (!e.subordinates.isEmpty()) {
                List<Integer> temp = new LinkedList<>(e.subordinates);
                idToPeople.put(e.id, temp);
            }
        }
        int ret = 0;
        List<Integer> dealIds = new LinkedList<>();
        dealIds.add(id);

        while (!dealIds.isEmpty()) {
            List<Integer> copy = new LinkedList<>(dealIds);
            int size = copy.size();
            for (int i = 0; i < size; i++) {
                int peopleId = copy.get(i);
                ret += employToValue.get(peopleId);
                if (idToPeople.get(peopleId) != null) {
                    copy.addAll(idToPeople.get(peopleId));
                }
            }
            copy.removeAll(dealIds);
            dealIds = copy;
        }

        return ret;
    }
}