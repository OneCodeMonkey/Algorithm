// AC: 217 ms 
// Memory: 0 KB
// Thought: using stack
// T:O(n), S:O(n)
// 
import java.util.Scanner;
import java.util.Stack;

public class Codeforces_556A_Case_of_the_Zeros_and_Ones {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        Stack<Character> record = new Stack<>();
        for (char c : str.toCharArray()) {
            if (record.empty() || record.peek() == c) {
                record.add(c);
            } else {
                record.pop();
            }
        }
        System.out.println(record.size());
    }
}
