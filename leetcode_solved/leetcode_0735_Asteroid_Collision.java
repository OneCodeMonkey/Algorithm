// AC: Runtime: 8 ms, faster than 19.83% of Java online submissions for Asteroid Collision.
// Memory Usage: 45.3 MB, less than 6.23% of Java online submissions for Asteroid Collision.
// Using stack
// T:O(n), S:O(n)
// 
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> record = new Stack<>();
        int size = asteroids.length;
        for (int i = 0; i < size; i++) {
            if (record.empty()) {
                record.add(asteroids[i]);
                continue;
            }
            if (asteroids[i] > 0) {
                record.add(asteroids[i]);
            } else {
                if (record.peek() < 0) {
                    record.add(asteroids[i]);
                } else if (record.peek() > -asteroids[i]) {
                    //
                } else {
                    // adjacent smaller disappear step by step
                    while (!record.empty() && record.peek() > 0 && record.peek() < -asteroids[i]) {
                        record.pop();
                    }
                    if (record.empty()) {
                        record.push(asteroids[i]);
                        continue;
                    }
                    // positive bigger one survive
                    if (record.peek() > -asteroids[i]) {   
                        //
                    }
                    // both disappear
                    else if (record.peek() == -asteroids[i]) {   
                        record.pop();
                    } else {
                        record.push(asteroids[i]);
                    }
                }
            }
        }
        int[] ret = new int[record.size()];
        int pos = record.size() - 1;
        while (!record.empty()) {
            ret[pos--] = record.pop();
        }

        return ret;
    }
}
