// AC: 265 ms 
// Memory: 100 KB
// just use (b, c, c) can make up a triangle
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1337A_Ichihime_and_Triangle {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println(b + " " + c + " " + c);
        }
    }
}
