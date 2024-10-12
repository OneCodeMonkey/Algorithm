// AC: 327 ms 
// Memory: 800 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1987A_Upload_More_RAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int ret = (n - 1) * k + 1;

            System.out.println(ret);
        }
    }
}
