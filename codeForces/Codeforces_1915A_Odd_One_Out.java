// AC: 186 ms 
// Memory: 24700 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1915A_Odd_One_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = a;
            if (b != c) {
                ret = a == c ? b : c;
            }
            System.out.println(ret);
        }
    }
}
