// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_431A_Black_Square {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), a4 = sc.nextInt(), ret = 0;
        String str = sc.next();
        int[] mapping = new int[]{a1, a2, a3, a4};
        for (char c : str.toCharArray()) {
            ret += mapping[c - '0' - 1];
        }

        System.out.println(ret);
    }
}
