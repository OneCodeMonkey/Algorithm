// AC: Runtime: 3 ms, faster than 100.00% of Java online submissions for Minimize Result by Adding Parentheses to Expression.
// Memory Usage: 42.2 MB, less than 100.00% of Java online submissions for Minimize Result by Adding Parentheses to Expression.
// brute-force, do as it says.
// T:(logn * logn), S:O(logn), n = expression.length()
// 
class Solution {
    public String minimizeResult(String expression) {
        String[] arr = expression.split("\\+");
        int left = Integer.parseInt(arr[0]), right = Integer.parseInt(arr[1]), ret = left * right, maxI = 0, maxJ = expression.length() - 1;
        List<Integer> leftDigits = new ArrayList<>(), rightDigits = new ArrayList<>();
        while (left > 0) {
            leftDigits.add(left % 10);
            left /= 10;
        }
        while (right > 0) {
            rightDigits.add(right % 10);
            right /= 10;
        }
        Collections.reverse(leftDigits);
        Collections.reverse(rightDigits);
        for (int i = 0; i < leftDigits.size(); i++) {
            int base = 1, left1 = 1, left2 = 0;
            boolean flag1 = false;
            for (int k = i - 1; k >= 0; k--) {
                if (!flag1) {
                    left1 = 0;
                    flag1 = true;
                }
                left1 += leftDigits.get(k) * base;
                base *= 10;
            }
            base = 1;
            for (int k = leftDigits.size() - 1; k >= i; k--) {
                left2 += leftDigits.get(k) * base;
                base *= 10;
            }

            for (int j = 0; j < rightDigits.size(); j++) {
                int right1 = 0, right2 = 0;
                base = 1;
                for (int k = j - 1; k >= 0; k--) {
                    right1 += rightDigits.get(k) * base;
                    base *= 10;
                }
                base = 1;
                for (int k = rightDigits.size() - 1; k >= j; k--) {
                    right2 += rightDigits.get(k) * base;
                    base *= 10;
                }
                int numNum = left1 * (left2 + right1) * right2;
                if (right1 == 0) {
                    numNum = left1 * (left2 + right2);
                }
                if (numNum < ret) {
                    ret = numNum;
                    maxI = i;
                    if (j != 0) {
                        maxJ = j + arr[0].length();
                    }
                }
            }
        }

        StringBuilder retStr = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (i == maxI) {
                retStr.append("(");
            }
            retStr.append(expression.charAt(i));
            if (i == maxJ) {
                retStr.append(")");
            }
        }

        return retStr.toString();
    }
}