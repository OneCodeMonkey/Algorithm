// Runtime 193 ms Beats 100.00% 
// Memory 56.11 MB Beats 100.00%
// Map.
// T:O(1), S:O(n)
// 
class Spreadsheet {
    HashMap<String, Integer> record;

    public Spreadsheet(int rows) {
        record = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        record.put(cell, value);
    }

    public void resetCell(String cell) {
        record.put(cell, 0);
    }

    public int getValue(String formula) {
        String[] arr = formula.substring(1).split("\\+");
        int val1 = 0, val2 = 0;
        try {
            val1 = Integer.parseInt(arr[0]);
        } catch (Exception e) {
            val1 = record.getOrDefault(arr[0], 0);
        }

        try {
            val2 = Integer.parseInt(arr[1]);
        } catch (Exception e) {
            val2 = record.getOrDefault(arr[1], 0);
        }

        return val1 + val2;
    }
}

