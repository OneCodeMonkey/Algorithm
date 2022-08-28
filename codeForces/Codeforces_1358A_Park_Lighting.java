// AC: 280 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1358A_Park_Lighting {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), area = n * m;
            System.out.println(area % 2 == 0 ? area / 2 : area / 2 + 1);
        }
    }
}
