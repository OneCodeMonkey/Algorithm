// AC: 436 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(log(max(nums[i])))
// 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1352A_Sum_of_Round_Numbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(), base = 1;
            List<Integer> record = new LinkedList<>();
            while (m > 0) {
                int digit = m % 10;
                if (digit != 0) {
                    record.add(digit * base);
                }
                m /= 10;
                base *= 10;
            }
            System.out.println(record.size());
            for (int item : record) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
