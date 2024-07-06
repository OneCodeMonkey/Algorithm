// AC: 311 ms 
// Memory: 1700 KB
// Check sum is even, if so the answer is true.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1102A_Integer_Sequence_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = (long) n * (n + 1) / 2;
        System.out.println(sum % 2);
    }
}
