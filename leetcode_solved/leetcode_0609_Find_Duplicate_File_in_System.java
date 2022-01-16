// AC: Runtime: 67 ms, faster than 17.10% of Java online submissions for Find Duplicate File in System.
// Memory Usage: 73.3 MB, less than 14.81% of Java online submissions for Find Duplicate File in System.
// hashmap
// T:O(sum(paths[i])), S:O(sum(paths[i]))
// 
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> record = new HashMap<>();
        for (String path : paths) {
            String[] arr = path.split(" ");
            String prefix = arr[0];
            for (int i = 1; i < arr.length; i++) {
                String[] arr2 = arr[i].split("\\(");
                String content = arr2[1].substring(0, arr2[1].length() - 1);
                String fullPath = prefix + "/" + arr2[0];
                if (record.containsKey(content)) {
                    record.get(content).add(fullPath);
                } else {
                    List<String> tempList = new ArrayList<>();
                    tempList.add(fullPath);
                    record.put(content, tempList);
                }
            }
        }
        List<List<String>> ret = new ArrayList<>();
        for (String key: record.keySet()) {
            if (record.get(key).size() > 1) {
                ret.add(record.get(key));
            }
        }

        return ret;
    }
}