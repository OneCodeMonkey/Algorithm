// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Long Pressed Name.
// Memory Usage: 36.8 MB, less than 88.08% of Java online submissions for Long Pressed Name.
// thoughts: two-pointer move forward and compare, see the annotation.
// T:O(len(typed)), S:O(1)
// 
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int size1 = name.length(), size2 = typed.length();
        if (size2 < size1 || (size2 == size1 && !name.equals(typed))) {
            return false;
        }
        int pos = 0;
        for (int i = 0; i < size1; i++) {
            if (pos >= size2 || name.charAt(i) != typed.charAt(pos)) {
                return false;
            } else {
                if (i == size1 - 1) {
                    // typed's remaining letters must equal last letter of name.
                    while (++pos < size2) {
                        if (typed.charAt(pos) != name.charAt(i)) {
                            return false;
                        }
                    }
                } else {
                    if (name.charAt(i) != name.charAt(i + 1)) {
                        // skipping the same letters.
                        while (pos + 1 < size2 && typed.charAt(pos + 1) == name.charAt(i)) {
                            pos++;
                        }
                    }
                    pos++;
                }
            }
        }

        return true;
    }
}