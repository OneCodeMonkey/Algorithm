// AC: Runtime: 3 ms, faster than 86.05% of Java online submissions for Complex Number Multiplication.
// Memory Usage: 37.3 MB, less than 75.87% of Java online submissions for Complex Number Multiplication.
// .
// T:O(max(len1, len2)), S:O(1)
// 
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int index1 = num1.indexOf("+"), index2 = num2.indexOf("+");
        int real1 = Integer.parseInt(num1.substring(0, index1));
        int imagine1 = Integer.parseInt(num1.substring(index1 + 1, num1.length() - 1));
        int real2 = Integer.parseInt(num2.substring(0, index2));
        int imagine2 = Integer.parseInt(num2.substring(index2 + 1, num2.length() - 1));
        
        int real = real1 * real2 - imagine1 * imagine2;
        int imagine = real1 * imagine2 + real2 * imagine1;

        return real + "+" + imagine + "i";
    }
}