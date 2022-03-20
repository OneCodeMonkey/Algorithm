// AC: Time: 404 ms 
// Memory: 0 KB
// .
// T:O(2^(logn)), S:O(2^(logn))
// 
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Codeforces_122A_Lucky_Division {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), countA = 0;
        List<Integer> record = Arrays.asList(4, 7, 44, 47, 74, 74, 444, 447, 474, 477, 744, 747, 777);
        for (int i : record) {
            if (n % i == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
