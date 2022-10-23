// AC: Runtime 0 ms Beats 100% 
// Memory 39.9 MB Beats 70%
// String comparison
// T:O(1), S:O(1)
// 
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return (event1[0].compareTo(event2[1]) <= 0 && event1[1].compareTo(event2[0]) >= 0) ||
                (event2[0].compareTo(event1[1]) <= 0 && event2[1].compareTo(event1[0]) >= 0);
    }
}
