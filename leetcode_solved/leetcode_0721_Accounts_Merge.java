// Solution 1: brute-force loop merge.
// AC: Runtime: 100 ms, faster than 13.03% of Java online submissions for Accounts Merge.
// Memory Usage: 66.3 MB, less than 8.52% of Java online submissions for Accounts Merge.
// circular merge sets.
// T:O(n^2 ~ +∞), S:O(n)
// 
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, List<HashSet<String>>> peoplesEmailMapping = new HashMap<>();
        for (List<String> account:accounts) {
            String people = account.get(0);
            if (peoplesEmailMapping.containsKey(people)) {
                boolean hasSame = false;
                for (int i = 1; i < account.size(); i++) {
                    for (HashSet<String> emailSet: peoplesEmailMapping.get(people)) {
                        if (emailSet.contains(account.get(i))) {
                            hasSame = true;
                            emailSet.addAll(account.subList(1, account.size()));
                            break;
                        }
                    }
                    if (hasSame) {
                        break;
                    }
                }
                if (!hasSame) {
                    HashSet<String> tempSet = new HashSet<>(account.subList(1, account.size()));
                    peoplesEmailMapping.get(people).add(tempSet);
                }
            } else {
                HashSet<String> tempSet = new HashSet<>(account.subList(1, account.size()));
                List<HashSet<String>> tempList = new ArrayList<>();
                tempList.add(tempSet);
                peoplesEmailMapping.put(people, tempList);
            }
        }

        // circular merge sets
        boolean hasMerged;
        do {
            hasMerged = false;
            for (String people : peoplesEmailMapping.keySet()) {
                List<HashSet<String>> newList = new LinkedList<>();
                for (HashSet<String> peopleEmailSet : peoplesEmailMapping.get(people)) {
                    boolean hasSame = false;
                    for (String email : peopleEmailSet) {
                        for (HashSet<String> emailSet : newList) {
                            if (emailSet.contains(email)) {
                                hasSame = true;
                                hasMerged = true;
                                emailSet.addAll(peopleEmailSet);
                                break;
                            }
                        }
                        if (hasSame) {
                            break;
                        }
                    }
                    if (!hasSame) {
                        newList.add(peopleEmailSet);
                    }
                }
                peoplesEmailMapping.put(people, newList);
            }
        } while (hasMerged);

        List<List<String>> ret = new LinkedList<>();
        for (String people: peoplesEmailMapping.keySet()) {
            for (HashSet<String> peopleEmailSet: peoplesEmailMapping.get(people)) {
                List<String> tempList = new LinkedList<>(peopleEmailSet);
                Collections.sort(tempList);
                tempList.add(0, people);
                ret.add(tempList);
            }
        }

        return ret;
    }
}

// todo
// Solution 2: graph union-find way
// 