// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1283A_Minutes_Before_the_New_Year {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt(), m = sc.nextInt(), diff = (24 - h) * 60 - m;
            System.out.println(diff);
        }
    }
}
