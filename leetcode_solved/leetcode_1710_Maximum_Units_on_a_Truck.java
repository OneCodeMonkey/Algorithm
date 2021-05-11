// 贪心法。但第一想法是用 TreeMap 来进行多字段排序，发现不如直接对 Array 排序快
// Runtime: 12 ms, faster than 22.19% of Java online submissions for Maximum Units on a Truck.
// Memory Usage: 39.2 MB, less than 43.61% of Java online submissions for Maximum Units on a Truck.
// 略。
// T:O(nlogn), S:O(n)
//
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        TreeMap<Integer, Integer> record = new TreeMap<>(new MapKeyComparator());
        for (int[] row: boxTypes) {
            record.merge(row[1], row[0], Integer::sum);
        }
        int sum = 0;
        for (int perBox: record.keySet()) {
            int temp = Math.min(record.get(perBox), truckSize);
            sum += temp * perBox;
            truckSize -= temp;
            if (truckSize == 0) {
                return sum;
            }
        }
        return sum;
    }
}

class MapKeyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        // 倒序排列
        return Integer.compare(num2, num1);
    }
}

// 法二： Array 直接排序
// Runtime: 7 ms, faster than 91.38% of Java online submissions for Maximum Units on a Truck.
// Memory Usage: 39.1 MB, less than 69.99% of Java online submissions for Maximum Units on a Truck.
// 略.
// T:O(nlogn), S:O(1)
//
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // 对列字段进行倒序排序
        Arrays.sort(boxTypes, (a, b) -> {return b[1] - a[1];});
        int sum = 0, count = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int temp = Math.min(truckSize, boxTypes[i][0]);
            sum += temp * boxTypes[i][1];
            truckSize -= temp;
            if (truckSize == 0) {
                return sum;
            }
        }
        return sum;
    }
}