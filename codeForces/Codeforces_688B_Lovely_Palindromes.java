// AC: 202 ms 
// Memory: 0 KB
// See some regularity, 1-th is 11, 10-th is 1001, 100-th is 100001, 1000-th is 10000001.
// T:O(1), S:O(n)
//
import java.util.Scanner;

public class Codeforces_688B_Lovely_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        StringBuilder ret = new StringBuilder(), nStr = new StringBuilder(n);
        ret.append(n);
        ret.append(nStr.reverse());

        System.out.println(ret.toString());
    }
}
