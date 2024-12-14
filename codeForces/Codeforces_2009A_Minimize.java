// AC: 280 ms 
// Memory: 400 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2009A_Minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(b - a);
        }
    }
}
