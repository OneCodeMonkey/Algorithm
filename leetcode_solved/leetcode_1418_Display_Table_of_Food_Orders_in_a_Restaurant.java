// AC: Runtime: 99 ms, faster than 28.57% of Java online submissions for Display Table of Food Orders in a Restaurant.
// Memory Usage: 54.5 MB, less than 80.12% of Java online submissions for Display Table of Food Orders in a Restaurant.
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> ret = new LinkedList<>();
        TreeMap<Integer, List<String>> record = new TreeMap<>();
        List<String> foods = new ArrayList<>();
        HashSet<String> foodSet = new HashSet<>();
        for (List<String> order: orders) {
            String food = order.get(2);
            int tableIndex = Integer.parseInt(order.get(1));
            if (!foodSet.contains(food)) {
                foodSet.add(food);
                foods.add(food);
            }
            if (record.containsKey(tableIndex)) {
                record.get(tableIndex).add(food);
            } else {
                List<String> temp = new LinkedList<>();
                temp.add(food);
                record.put(tableIndex, temp);
            }
        }
        Collections.sort(foods);
        List<String> headRow = new LinkedList<>();
        headRow.add("Table");
        headRow.addAll(foods);
        ret.add(headRow);
        for (int tableIndex: record.keySet()) {
            List<String> row = new LinkedList<>();
            List<String> tableFood = record.get(tableIndex);
            HashMap<String, Integer> foodCount = new HashMap<>();
            for (String foodItem: tableFood) {
                foodCount.merge(foodItem, 1, Integer::sum);
            }
            row.add(String.valueOf(tableIndex));
            for (int i = 1; i < headRow.size(); i++) {
                if (foodCount.containsKey(headRow.get(i))) {
                    row.add(String.valueOf(foodCount.get(headRow.get(i))));
                } else {
                    row.add("0");
                }
            }
            ret.add(row);
        }

        return ret;
    }
}