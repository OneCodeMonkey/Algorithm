// AC: 187 ms 
// Memory: 0 KB
// 8^n last digit is circling by every 4 times.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_742A_Arpa_s_hard_exam_and_Mehrdad_s_naive_cheat {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 1;
        if (n > 0) {
            switch (n % 4) {
                case 0:
                    ret = 6;
                    break;
                case 1:
                    ret = 8;
                    break;
                case 2:
                    ret = 4;
                    break;
                case 3:
                    ret = 2;
                    break;
                default:
            }
        }
        System.out.println(ret);
    }
}
