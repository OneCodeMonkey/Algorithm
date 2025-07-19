// Runtime 6 ms Beats 100.00% 
// Memory 45.50 MB Beats 100.00%
// String.
// T:O(n*logn), S:O(n)
// 
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ret = new ArrayList<>(), categoryList = Arrays.asList("electronics", "grocery", "pharmacy",
                "restaurant");
        List<List<String>> answers = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && categoryList.contains(businessLine[i]) && !code[i].isEmpty()) {
                boolean isValid = true;
                for (char c : code[i].toCharArray()) {
                    if (c != '_' && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'Z')) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    answers.add(Arrays.asList(businessLine[i], code[i]));
                }
            }
        }
        if (!answers.isEmpty()) {
            answers.sort((a, b) -> a.get(0).compareTo(b.get(0)) == 0 ? (a.get(1).compareTo(b.get(1))) :
                    (a.get(0).compareTo(b.get(0)) < 0 ? -1 : 1));
            for (List<String> row : answers) {
                ret.add(row.get(1));
            }
        }


        return ret;
    }
}
