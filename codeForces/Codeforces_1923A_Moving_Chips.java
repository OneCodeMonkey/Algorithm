// AC: 280 ms 
// Memory: 1200 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1923A_Moving_Chips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), firstOneIndex = -1, lastOneIndex = -1, sum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    if (firstOneIndex == -1) {
                        firstOneIndex = j;
                        lastOneIndex = j;
                    } else {
                        lastOneIndex = j;
                    }
                    sum += 1;
                }
            }

            System.out.println(lastOneIndex - firstOneIndex + 1 - sum);
        }
    }
}
