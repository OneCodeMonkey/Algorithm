// AC: Time: 187 ms 
// Memory: 0 KB
// Math.ceil()
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_617A_Elephant {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println((int) Math.ceil(n * 1.0 / 5));
    }
}