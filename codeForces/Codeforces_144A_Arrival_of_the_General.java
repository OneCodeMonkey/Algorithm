// AC: Time: 404 ms 
// Memory: 0 KB
// divide and discuss
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_144A_Arrival_of_the_General {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), first = -1, last = -1, min = Integer.MAX_VALUE, minIndex = -1, max = Integer.MIN_VALUE, maxIndex = -1, count = 0;
        while (sc.hasNext()) {
            int i = sc.nextInt();
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
            count++;
            if (i > max) {
                max = i;
                maxIndex = count;
            }
            if (i <= min) {
                min = i;
                minIndex = count;
            }
        }
        if (first != max) {
            if (last != min) {
                if (maxIndex > minIndex) {
                    System.out.println(maxIndex - 1 + n - minIndex - 1);
                } else {
                    System.out.println(maxIndex - 1 + n - minIndex);
                }
            } else {
                System.out.println(maxIndex - 1);
            }
        } else {
            if (last != min) {
                System.out.println(n - minIndex);
            } else {
                System.out.println(0);
            }
        }
    }
}
