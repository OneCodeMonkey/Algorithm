// AC: Time: 466 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_200B_Drinks {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0, n = sc.nextInt();
        while (sc.hasNext()) {
            sum += sc.nextInt();
        }
        float ret = sum * 1.0f / n;
        System.out.printf("%.4f%n", ret);
    }
}
