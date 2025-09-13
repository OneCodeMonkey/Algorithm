// Runtime 939 ms Beats 5.18% 
// Memory 78.59 MB Beats 86.53%
// Greedy: Using a heap. Every operation we gain to a/b is (b-a)/(b*(b+1))
// T:O((m+n)logn), S:O(n)
// 
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<List<Integer>> record = new PriorityQueue<>((o1, o2) -> {
            int a = o1.get(0), b = o1.get(1), a1 = o2.get(0), b1 = o2.get(1);
            double gain1 = (b - a) * 1.0 / ((long) b * (b + 1));
            double gain2 = (b1 - a1) * 1.0 / ((long) b1 * (b1 + 1));
            return Double.compare(gain2, gain1);
        });
        double sumRatio = 0;
        for (int[] row : classes) {
            if (row[0] == row[1]) {
                sumRatio += 1;
            } else {
                record.add(Arrays.asList(row[0], row[1]));
            }
        }
        while (extraStudents > 0 && !record.isEmpty()) {
            List<Integer> top = record.poll();
            record.add(Arrays.asList(top.get(0) + 1, top.get(1) + 1));
            extraStudents--;
        }

        while (!record.isEmpty()) {
            List<Integer> top = record.poll();
            sumRatio += top.get(0) * 1.0 / top.get(1);
        }

        return sumRatio / classes.length;
    }
}


// Solution 2: Using int[] instead of List<>
// Runtime 494 ms Beats 20.73% 
// Memory 99.45 MB Beats 19.69%
// Greedy: Using a heap. Every operation we gain to a/b is (b-a)/(b*(b+1))
// T:O((m+n)logn), S:O(n)
// 
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> record = new PriorityQueue<>((o1, o2) -> {
            int a = o1[0], b = o1[1], a1 = o2[0], b1 = o2[1];
            double gain1 = (b - a) * 1.0 / ((long) b * (b + 1));
            double gain2 = (b1 - a1) * 1.0 / ((long) b1 * (b1 + 1));
            return Double.compare(gain2, gain1);
        });
        double sumRatio = 0;
        for (int[] row : classes) {
            if (row[0] == row[1]) {
                sumRatio += 1;
            } else {
                record.add(new int[]{row[0], row[1]});
            }
        }
        while (extraStudents > 0 && !record.isEmpty()) {
            int[] top = record.poll();
            record.add(new int[]{top[0] + 1, top[1] + 1});
            extraStudents--;
        }

        while (!record.isEmpty()) {
            int[] top = record.poll();
            sumRatio += top[0] * 1.0 / top[1];
        }

        return sumRatio / classes.length;
    }
}


// Solution 3: Simply the heap comparator.
// Runtime 354 ms Beats 60.62% 
// Memory 99.39 MB Beats 19.69%
// Greedy: max heap.
// T:((m + n) * logn), S:O(n)
// 
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> record = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        double sumRatio = 0;
        for (int[] row : classes) {
            if (row[0] == row[1]) {
                sumRatio += 1;
            } else {
                double gain = (row[0] + 1) * 1.0 / (row[1] + 1) - row[0] * 1.0 / row[1];
                record.add(new double[]{gain, row[0], row[1]});
            }
        }
        while (extraStudents > 0 && !record.isEmpty()) {
            double[] top = record.poll();
            double newGain = (top[1] + 2.0) / (top[2] + 2) - (top[1] + 1.0) / (top[2] + 1);
            record.add(new double[]{newGain, top[1] + 1, top[2] + 1});
            extraStudents--;
        }

        while (!record.isEmpty()) {
            double[] top = record.poll();
            sumRatio += top[1] / top[2];
        }

        return sumRatio / classes.length;
    }
}
