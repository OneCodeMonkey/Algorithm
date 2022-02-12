// AC: Runtime: 4 ms, faster than 20.00% of Java online submissions for Capitalize the Title.
// Memory Usage: 41.2 MB, less than 20.00% of Java online submissions for Capitalize the Title.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String capitalizeTitle(String title) {
        HashMap<Character, Character> toUpperCase = new HashMap<>();
        HashMap<Character, Character> toLowerCase = new HashMap<>();
        toLowerCase.put('A', 'a');
        toLowerCase.put('B', 'b');
        toLowerCase.put('C', 'c');
        toLowerCase.put('D', 'd');
        toLowerCase.put('E', 'e');
        toLowerCase.put('F', 'f');
        toLowerCase.put('G', 'g');
        toLowerCase.put('H', 'h');
        toLowerCase.put('I', 'i');
        toLowerCase.put('J', 'j');
        toLowerCase.put('K', 'k');
        toLowerCase.put('L', 'l');
        toLowerCase.put('M', 'm');
        toLowerCase.put('N', 'n');
        toLowerCase.put('O', 'o');
        toLowerCase.put('P', 'p');
        toLowerCase.put('Q', 'q');
        toLowerCase.put('R', 'r');
        toLowerCase.put('S', 's');
        toLowerCase.put('T', 't');
        toLowerCase.put('U', 'u');
        toLowerCase.put('V', 'v');
        toLowerCase.put('W', 'w');
        toLowerCase.put('X', 'x');
        toLowerCase.put('Y', 'y');
        toLowerCase.put('Z', 'z');
        toUpperCase.put('a', 'A');
        toUpperCase.put('b', 'B');
        toUpperCase.put('c', 'C');
        toUpperCase.put('d', 'D');
        toUpperCase.put('e', 'E');
        toUpperCase.put('f', 'F');
        toUpperCase.put('g', 'G');
        toUpperCase.put('h', 'H');
        toUpperCase.put('i', 'I');
        toUpperCase.put('j', 'J');
        toUpperCase.put('k', 'K');
        toUpperCase.put('l', 'L');
        toUpperCase.put('m', 'M');
        toUpperCase.put('n', 'N');
        toUpperCase.put('o', 'O');
        toUpperCase.put('p', 'P');
        toUpperCase.put('q', 'Q');
        toUpperCase.put('r', 'R');
        toUpperCase.put('s', 'S');
        toUpperCase.put('t', 'T');
        toUpperCase.put('u', 'U');
        toUpperCase.put('v', 'V');
        toUpperCase.put('w', 'W');
        toUpperCase.put('x', 'X');
        toUpperCase.put('y', 'Y');
        toUpperCase.put('z', 'Z');
        StringBuilder ret = new StringBuilder();
        String[] strArr = title.split(" ");
        for (String str: strArr) {
            StringBuilder word = new StringBuilder();
            if (str.length() <= 2) {
                for (char c: str.toCharArray()) {
                    if (toLowerCase.containsKey(c)) {
                        word.append(toLowerCase.get(c));
                    } else {
                        word.append(c);
                    }
                }
                ret.append(word);
                ret.append(" ");
            } else {
                boolean firstUpper = false;
                for (char c : str.toCharArray()) {
                    if (!firstUpper) {
                        if (toUpperCase.containsKey(c)) {
                            word.append(toUpperCase.get(c));
                        } else {
                            word.append(c);
                        }
                        firstUpper =true;
                        continue;
                    }
                    if (toLowerCase.containsKey(c)) {
                        word.append(toLowerCase.get(c));
                    } else {
                        word.append(c);
                    }
                }
                ret.append(word);
                ret.append(" ");
            }
        }

        return ret.toString().trim();
    }
}