// AC: Runtime: 10 ms, faster than 45.69% of Java online submissions for Greatest Sum Divisible by Three.
// Memory Usage: 44.7 MB, less than 47.20% of Java online submissions for Greatest Sum Divisible by Three.
// .
// T:O(nlogn), S:O(logn)
//
class Solution {
    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, firstModOne = -1, firstModTwo = -1, secondModOne = -1, secondModTwo = -1;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 3 == 1) {
            for (int num : nums) {
                if (num % 3 == 1) {
                    if (firstModTwo != -1 && secondModTwo != -1) {
                        return sum - Math.min(num, firstModTwo + secondModTwo);
                    } else {
                        return sum - num;
                    }
                } else if (num % 3 == 2) {
                    if (firstModTwo == -1) {
                        firstModTwo = num;
                    } else if (secondModTwo == -1) {
                        secondModTwo = num;
                    }
                }
            }

            return (firstModTwo != -1 && secondModTwo != -1) ? sum - firstModTwo - secondModTwo : 0;
        } else if (sum % 3 == 2) {
            for (int num : nums) {
                if (num % 3 == 1) {
                    if (firstModOne == -1) {
                        firstModOne = num;
                    } else if (secondModOne == -1) {
                        secondModOne = num;
                    }
                } else if (num % 3 == 2) {
                    if (firstModOne != -1 && secondModOne != -1) {
                        return sum - Math.min(num, firstModOne + secondModOne);
                    } else {
                        return sum - num;
                    }
                }
            }

            return (firstModOne != -1 && secondModOne != -1) ? sum - firstModOne - secondModOne : 0;
        } else {
            return sum;
        }
    }
}