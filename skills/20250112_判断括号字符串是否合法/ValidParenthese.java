class ValidParenthese {
    private static boolean checkValid(String str) {
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "()", str2 = "()()", str3 = "(()())", str4 = "()())()(())", str5 = ")(()())";
        System.out.println("str: " + str1 + " is " + (checkValid(str1) ? "valid" : "invalid" + " parenthese string."));
        System.out.println("str: " + str2 + " is " + (checkValid(str2) ? "valid" : "invalid" + " parenthese string."));
        System.out.println("str: " + str3 + " is " + (checkValid(str3) ? "valid" : "invalid" + " parenthese string."));
        System.out.println("str: " + str4 + " is " + (checkValid(str4) ? "valid" : "invalid" + " parenthese string."));
        System.out.println("str: " + str5 + " is " + (checkValid(str5) ? "valid" : "invalid" + " parenthese string."));
    }
}
