// AC: 436 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0255A_Greg_s_Workout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i % 3 == 0) {
                count1 += a;
            } else if (i % 3 == 1) {
                count2 += a;
            } else {
                count3 += a;
            }
        }

        if (count1 > count2 && count1 > count3) {
            System.out.println("chest");
        } else if (count2 > count3) {
            System.out.println("biceps");
        } else {
            System.out.println("back");
        }
    }
}
