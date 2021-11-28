// AC: Runtime: 1 ms, faster than 80.00% of Java online submissions for Watering Plants.
// Memory Usage: 40.1 MB, less than 20.00% of Java online submissions for Watering Plants.
// simulate.
// T:O(n), S:O(1)
// 
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step = 0, pos = 0, size = plants.length, curCapacity = capacity;
        while (pos < size) {
            step += pos + 1;
            curCapacity -= plants[pos];
            pos++;
            if (curCapacity > 0) {
                while (pos < size && plants[pos] <= curCapacity) {
                    step += 1;
                    curCapacity -= plants[pos];
                    pos++;
                }
                if (pos >= size) {
                    return step;
                }
                step += pos;
                curCapacity = capacity;
            } else {
                if (pos >= size) {
                    return step;
                }
                step += pos;
                curCapacity = capacity;
            }
        }

        return step;
    }
}
