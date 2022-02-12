// AC: Runtime: 19 ms, faster than 19.35% of Java online submissions for Queue Reconstruction by Height.
// Memory Usage: 54.7 MB, less than 10.64% of Java online submissions for Queue Reconstruction by Height.
// greedy. First put people with more height and low rank, then put smaller height people.
// T:O(nlogn), S:O(n), n = people.length
// 
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (b[0] - a[0])));
        List<List<Integer>> record = new LinkedList<>();
        for (int[] peopleItem : people) {
            List<Integer> tempList = new LinkedList<>();
            tempList.add(peopleItem[0]);
            tempList.add(peopleItem[1]);
            record.add(peopleItem[1], tempList);
        }

        int[][] ret = new int[people.length][2];
        int pos = 0;
        for (List<Integer> peopleItem : record) {
            ret[pos++] = new int[]{peopleItem.get(0), peopleItem.get(1)};
        }

        return ret;
    }
}