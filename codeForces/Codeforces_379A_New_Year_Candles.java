// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(loga(b)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_379A_New_Year_Candles {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), remain = 0, ret = 0;
        while (true) {
            int newBurn = a + remain / b;
            if (newBurn == 0) {
                break;
            }
            ret += newBurn;
            a = 0;
            remain -= remain / b * b;
            remain += newBurn;
        }

        System.out.println(ret);
    }
}
