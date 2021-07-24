// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Number.
// Memory Usage: 39.1 MB, less than 54.90% of Java online submissions for Valid Number.
// very verbose... better using regex
// T:O(n), S:O(1)
//
class Solution {
    public boolean isNumber(String s) {
        int size = s.length(), eCount = 0, ECount = 0, signCount = 0, dotCount = 0, indexE = -1, indexSign1 = -1, indexSign2 = -1, indexDot = -1;
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == 'e') {
                eCount++;
                indexE = i;
                if (eCount + ECount > 1) {
                    return false;
                }
            }
            if (c == 'E') {
                ECount++;
                indexE = i;
                if (eCount + ECount > 1) {
                    return false;
                }
            }
            if (c == '-' || c == '+') {
                signCount++;
                if (indexSign1 == -1) {
                    indexSign1 = i;
                } else if (indexSign2 == -1) {
                    indexSign2 = i;
                    if (indexSign2 == size - 1) {
                        return false;
                    }
                }
                if (signCount > 2) {
                    return false;
                }
            }
            if (c == '.') {
                dotCount++;
                indexDot = i;
                if (dotCount > 1) {
                    return false;
                }
            }
        }

        // no first sign or first sign is 0
        if (indexSign2 != -1 && indexSign1 != -1 && indexSign1 != 0) {
            return false;
        }

        // check e or E
        if (indexE >= 0) {
            if (indexSign1 != -1 && indexSign1 != 0 && indexSign1 < indexE) {
                return false;
            }
            if (indexSign1 > indexE) {
                indexSign2 = indexSign1;
                indexSign1 = -1;
            }
            if (indexE == 0 || indexE == size - 1 || (indexSign2 != -1 && indexSign2 != indexE + 1)) {
                return false;
            }
            int indexECopy = indexE;
            if (indexSign1 == indexE + 1 || indexSign2 == indexE + 1) {
                indexECopy++;
            }
            if (indexECopy == size - 1) {
                return false;
            }
            for (int i = indexECopy + 1; i < size; i++) {
                char temp = s.charAt(i);
                if (temp < '0' || temp > '9') {
                    return false;
                }
            }
        } else {
            if (signCount > 1 || indexSign1 > 0) {
                return false;
            }
        }

        // check decimal
        int firstIndex = indexSign1 + 1, endIndex = indexE >= 0 ? indexE - 1 : size - 1;
        if (endIndex < firstIndex) {
            return false;
        }
        if (indexDot != -1 && (endIndex == firstIndex || indexDot < firstIndex || indexDot > endIndex)) {
            return false;
        }
        for (int i = firstIndex; i <= endIndex; i++) {
            char c = s.charAt(i);
            if (c != '.' && (c < '0' || c > '9')) {
                return false;
            }
        }

        return true;
    }
}