// 方法二：得到每个字符串的奇数位和偶数位统计情况以后，组成一个特征字符串存入 set，用 set 去重
// AC: Runtime: 13 ms, faster than 55.72% of Java online submissions for Groups of Special-Equivalent Strings.
// Memory Usage: 38.7 MB, less than 80.98% of Java online submissions for Groups of Special-Equivalent Strings.
// 略
// T:O(words.length * len(words[i])), S:O(words.length * len(words[i]))
//
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> record = new HashSet<>();
        for (String str: words) {
            int[] even = new int[26];
            int[] odd = new int[26];
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    even[str.charAt(i) - 'a']++;
                } else {
                    odd[str.charAt(i) - 'a']++;
                }
            }
            record.add(Arrays.toString(even) + Arrays.toString(odd));
        }
        
        return record.size();
    }
}

// 方法一：直接遍历，逐个判断两两字符串是否奇数位和偶数位组成相同。
// AC: Runtime: 672 ms, faster than 5.05% of Java online submissions for Groups of Special-Equivalent Strings.
// Memory Usage: 39.8 MB, less than 6.57% of Java online submissions for Groups of Special-Equivalent Strings.
// T:O(words.length ^ 2 * len(words[i])), S:O(words.length * len(words[i]))
// 
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        int size = words.length;
        List<HashSet<String>> record = new LinkedList<>();
        HashSet<Integer> used = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (used.contains(i)) {
                continue;
            }
            HashSet<String> temp = new HashSet<>();
            temp.add(words[i]);
            for (int j = i + 1; j < size; j++) {
                if (check(words[i], words[j])) {
                    temp.add(words[j]);
                    used.add(j);
                }
            }
            record.add(temp);
        }

        return record.size();
    }

    private boolean check(String s1, String s2) {
        HashMap<Character, Integer> even1 = new HashMap<>();
        HashMap<Character, Integer> even2 = new HashMap<>();
        HashMap<Character, Integer> odd1 = new HashMap<>();
        HashMap<Character, Integer> odd2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                even1.merge(s1.charAt(i), 1, Integer::sum);
                even2.merge(s2.charAt(i), 1, Integer::sum);
            } else {
                odd1.merge(s1.charAt(i), 1, Integer::sum);
                odd2.merge(s2.charAt(i), 1, Integer::sum);
            }
        }
        for (char c: even1.keySet()) {
            if (even2.get(c) == null || even1.get(c).intValue() != even2.get(c).intValue()) {
                return false;
            }
        }
        for (char c: odd1.keySet()) {
            if (odd2.get(c) == null || odd1.get(c).intValue() != odd2.get(c).intValue()) {
                return false;
            }
        }
        return true;
    }
}

