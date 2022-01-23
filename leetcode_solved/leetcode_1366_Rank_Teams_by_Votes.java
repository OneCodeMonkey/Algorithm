// AC: Runtime: 37 ms, faster than 10.34% of Java online submissions for Rank Teams by Votes.
// Memory Usage: 42.2 MB, less than 17.40% of Java online submissions for Rank Teams by Votes.
// sort by string.
// T:O(sum(votes[i].length())), S:O(votes.length())
// 
class Solution {
    public String rankTeams(String[] votes) {
        int peopleCount = votes[0].length();
        HashMap<Character, HashMap<Integer, Integer>> peopleRankCount = new HashMap<>();
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                char people = vote.charAt(i);
                if (peopleRankCount.containsKey(people)) {
                    peopleRankCount.get(people).merge(i + 1, 1, Integer::sum);
                } else {
                    HashMap<Integer, Integer> tempHashmap = new HashMap<>();
                    tempHashmap.merge(i + 1, 1, Integer::sum);
                    peopleRankCount.put(people, tempHashmap);
                }
            }
        }
        TreeMap<String, List<Character>> rank = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (char people : peopleRankCount.keySet()) {
            StringBuilder ret = new StringBuilder();
            int[] rankArr = new int[peopleCount];
            for (int rankItem : peopleRankCount.get(people).keySet()) {
                int time = peopleRankCount.get(people).get(rankItem);
                rankArr[rankItem - 1] = time;
            }
            // string align.
            for (int i:rankArr) {
                if (i == 0) {
                    ret.append("0000");
                } else {
                    if (i < 10) {
                        ret.append("000");
                    } else if (i < 100) {
                        ret.append("00");
                    } else if (i < 1000) {
                        ret.append("0");
                    }
                    ret.append(i);
                }
            }
            String rankStr = ret.toString();
            if (rank.containsKey(rankStr)) {
                rank.get(rankStr).add(people);
            } else {
                List<Character> tempList = new ArrayList<>();
                tempList.add(people);
                rank.put(rankStr, tempList);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String rankStr: rank.keySet()) {
            Collections.sort(rank.get(rankStr));
            for (char c: rank.get(rankStr)) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}