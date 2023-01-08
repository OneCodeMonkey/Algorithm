// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1433B_Yet_Another_Bookshelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0, firstOneIndex = -1, lastOneIndex = -1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    sum++;
                    if (firstOneIndex == -1) {
                        firstOneIndex = j;
                    }
                    lastOneIndex = j;
                }
            }
            int ret = (lastOneIndex - firstOneIndex + 1) - sum;
            System.out.println(ret);
        }
    }
}
