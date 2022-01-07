// AC: Runtime: 27 ms, faster than 17.70% of Java online submissions for Maximum Candies You Can Get from Boxes.
// Memory Usage: 97.5 MB, less than 9.73% of Java online submissions for Maximum Candies You Can Get from Boxes.
// do as the problem says.
// T:O(n^2), S:O(n), n is the number of boxes.
// 
class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        HashSet<Integer> boxes = new HashSet<>();
        HashSet<Integer> boxesNotKeys = new HashSet<>();
        HashSet<Integer> haveKeys = new HashSet<>();
        int ret = 0;
        List<Integer> toOpen = new ArrayList<>();
        HashSet<Integer> newAdd = new HashSet<>();
        for (int i:initialBoxes) {
            toOpen.add(i);
            if (status[i] == 1) {
                boxes.add(i);
            } else {
                boxesNotKeys.add(i);
            }
            for (int j: containedBoxes[i]) {
                newAdd.add(j);
            }
            for (int j: keys[i]) {
                haveKeys.add(j);
            }
        }
        toOpen.clear();
        toOpen.addAll(newAdd);
        while (!toOpen.isEmpty()) {
            newAdd.clear();
            for (int i: toOpen) {
                if (status[i] == 1) {
                    boxes.add(i);
                } else {
                    boxesNotKeys.add(i);
                }
                for (int j: containedBoxes[i]) {
                    if (!boxes.contains(j)) {
                        newAdd.add(j);
                    }
                }
                for (int j: keys[i]) {
                    haveKeys.add(j);
                }
            }
            toOpen.clear();
            toOpen.addAll(newAdd);
        }

        for (int i: boxes) {
            ret += candies[i];
        }
        for (int i: boxesNotKeys) {
            if (!boxes.contains(i) && haveKeys.contains(i)) {
                ret += candies[i];
            }
        }

        return ret;
    }
}