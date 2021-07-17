// AC: Runtime: 33 ms, faster than 31.94% of Java online submissions for Subrectangle Queries.
// Memory Usage: 44.7 MB, less than 30.33% of Java online submissions for Subrectangle Queries.
// using arrayList to initialize.
// T:O(m*n) & O(1), S:O(m*n)
//
class SubrectangleQueries {
    private List<List<Integer>> record;

    public SubrectangleQueries(int[][] rectangle) {
        record = new ArrayList<>();
        for (int[] row: rectangle) {
            List<Integer> temp = new ArrayList<>();
            for (int i: row) {
                temp.add(i);
            }
            record.add(temp);
        }
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                record.get(i).set(j, newValue);
            }
        }
    }

    public int getValue(int row, int col) {
        return record.get(row).get(col);
    }
}


/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */