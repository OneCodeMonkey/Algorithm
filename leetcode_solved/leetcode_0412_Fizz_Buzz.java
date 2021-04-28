// AC:
// Runtime: 1 ms, faster than 99.72% of Java online submissions for Fizz Buzz.
// Memory Usage: 40.4 MB, less than 26.25% of Java online submissions for Fizz Buzz.
//
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ret.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ret.add("Fizz");
            } else if (i % 5 == 0) {
                ret.add("Buzz");
            } else {
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}