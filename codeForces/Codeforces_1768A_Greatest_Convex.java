// AC: 467 ms 
// Memory: 0 KB
// thought: x! + (x-1)! = (x + 1) * (x-1)!, so just make x = k-1  is ok.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1768A_Greatest_Convex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            System.out.println(k - 1);
        }
    }
}
