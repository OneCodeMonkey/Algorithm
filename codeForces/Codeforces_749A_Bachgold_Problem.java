// AC: 514 ms 
// Memory: 0 KB
// greedy, first 2, and 3
// T:O(n), S:O(n)
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_749A_Bachgold_Problem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        List<Integer> record = new ArrayList<>();
        while (n >= 2) {
            if (n == 2 || n == 3) {
                record.add(n);
                n = 0;
            } else {
                record.add(2);
                n -= 2;
            }
            ret++;
        }
        System.out.println(ret);
        for (int i = 0; i < ret; i++) {
            System.out.print(record.get(i));
            if (i != ret - 1) {
                System.out.print(" ");
            }
        }
    }
}
