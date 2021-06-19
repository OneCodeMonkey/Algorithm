// todo
// O(nlogn) 解法
// ...

//

// AC: Runtime: 22 ms, faster than 80.76% of Java online submissions for Count Number of Teams.
// Memory Usage: 38.5 MB, less than 71.72% of Java online submissions for Count Number of Teams.
// divide and count left and right, rating[i] = leftGreaterCount * rightSmallerCount + leftSmallerCount * rightGreaterCount
// T:O(n^2), S:O(1)
// 
class Solution {
    public int numTeams(int[] rating) {
        int ret = 0, size = rating.length;
        for (int i = 1; i < size - 1; i++) {
            int leftGreater = 0, leftSmaller = 0, rightGreater = 0, rightSmaller = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] > rating[i]) {
                    leftGreater++;
                } else {
                    leftSmaller++;
                }
            }
            for (int j = i + 1; j < size; j++) {
                if (rating[j] > rating[i]) {
                    rightGreater++;
                } else {
                    rightSmaller++;
                }
            }
            ret += leftGreater * rightSmaller + leftSmaller * rightGreater;
        }
        
        return ret;
    }
}

// AC: Runtime: 1931 ms, faster than 16.18% of Java online submissions for Count Number of Teams.
// Memory Usage: 38.7 MB, less than 38.19% of Java online submissions for Count Number of Teams.
// brute-force can pass
// T:O(n^3), S:O(1)
//
class Solution {
    public int numTeams(int[] rating) {
        int ret = 0, size = rating.length;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (rating[i] > rating[j]) {
                    continue;
                }
                for (int k = j + 1; k < size; k++) {
                    if (rating[j] > rating[k]) {
                        continue;
                    }
                    ret++;
                }
            }
        }
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (rating[i] < rating[j]) {
                    continue;
                }
                for (int k = j + 1; k < size; k++) {
                    if (rating[j] < rating[k]) {
                        continue;
                    }
                    ret++;
                }
            }
        }

        return ret;
    }
}