// AC: Time: 187 ms 
// Memory: 0 KB
// .
// T:O(log(b / a)), S:(1)
// 
import java.util.Scanner;

public class Codeforces_791A_Bear_and_Big_Brother {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), ret = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            ret++;
        }

        System.out.println(ret);
    }
}
