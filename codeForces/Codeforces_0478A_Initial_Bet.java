// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0478A_Initial_Bet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt(), c4 = sc.nextInt(), c5 = sc.nextInt();
        int sum = c1 + c2 + c3 + c4 + c5;
        int ret = (sum > 0 && sum % 5 == 0) ? sum / 5 : -1;

        System.out.println(ret);
    }
}
