// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_581A_Vasya_the_Hipster {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(Math.min(a, b) + " " + (Math.max(a, b) - Math.min(a, b)) / 2);
    }
}
