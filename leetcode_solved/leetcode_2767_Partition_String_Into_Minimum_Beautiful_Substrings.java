// AC: Runtime 6 ms Beats 31.20% 
// Memory 43.5 MB Beats 44.82%
// Reformat the code.
// T:O(n ^ 3), S:O(n)
// 
class Solution {
    public int minimumBeautifulSubstrings(String s) {
        String one = "1", five = "101", twentyFive = "11001", oneTwentyFive = "1111101", sixTwentyFive = "1001110001",
                threeOneTwentyFive = "110000110101", oneFiveSixTwentyFive = "11110100001001";
        List<String> fivePowers = Arrays.asList(one, five, twentyFive, oneTwentyFive, sixTwentyFive, threeOneTwentyFive, oneFiveSixTwentyFive);
        HashMap<Integer, String> lenToString = new HashMap<>();
        for (String key : fivePowers) {
            lenToString.put(key.length(), key);
        }

        int len = s.length();
        int[] dp = new int[len + 1];
        for (int i = 0; i < len + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < len; i++) {
            int curLen = i + 1;
            for (int lengthCheck : Arrays.asList(14, 12, 10, 7, 5, 3, 1)) {
                if (curLen >= lengthCheck && s.substring(i + 1 - lengthCheck, i + 1).equals(lenToString.get(lengthCheck))) {
                    if (curLen == lengthCheck) {
                        dp[i + 1] = 1;
                        break;
                    } else if (dp[i + 1 - lengthCheck] != Integer.MAX_VALUE) {
                        dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - lengthCheck] + 1);
                    }
                }
            }
        }

        return dp[len] == Integer.MAX_VALUE ? -1 : dp[len];
    }
}


// AC:  Runtime 3 ms Beats 66.36% 
// Memory 43.4 MB Beats 44.82%
// Raw implementation
// T:O(n ^ 3), S:O(n)
// 
class Solution {
    public int minimumBeautifulSubstrings(String s) {
        String one = "1", five = "101", twentyFive = "11001", oneTwentyFive = "1111101", sixTwentyFive = "1001110001",
                threeOneTwentyFive = "110000110101", oneFiveSixTwentyFive = "11110100001001";
        int len = s.length();
        int[] dp = new int[len + 1];
        for (int i = 0; i < len + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < len; i++) {
            int curLen = i + 1;
            if (curLen >= 14 && s.substring(i + 1 - 14, i + 1).equals(oneFiveSixTwentyFive)) {
                if (curLen == 14) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 14] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 14] + 1);
                }
            }
            if (curLen >= 12 && s.substring(i + 1 - 12, i + 1).equals(threeOneTwentyFive)) {
                if (curLen == 12) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 12] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 12] + 1);
                }
            }
            if (curLen >= 10 && s.substring(i + 1 - 10, i + 1).equals(sixTwentyFive)) {
                if (curLen == 10) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 10] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 10] + 1);
                }
            }
            if (curLen >= 7 && s.substring(i + 1 - 7, i + 1).equals(oneTwentyFive)) {
                if (curLen == 7) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 7] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 7] + 1);
                }
            }
            if (curLen >= 5 && s.substring(i + 1 - 5, i + 1).equals(twentyFive)) {
                if (curLen == 5) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 5] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 5] + 1);
                }
            }
            if (curLen >= 3 && s.substring(i + 1 - 3, i + 1).equals(five)) {
                if (curLen == 3) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 3] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 3] + 1);
                }
            }
            if (curLen >= 1 && s.substring(i + 1 - 1, i + 1).equals(one)) {
                if (curLen == 1) {
                    dp[i + 1] = 1;
                    continue;
                } else if (dp[i + 1 - 1] != Integer.MAX_VALUE) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i + 1 - 1] + 1);
                }
            }
        }

        return dp[len] == Integer.MAX_VALUE ? -1 : dp[len];
    }
}
