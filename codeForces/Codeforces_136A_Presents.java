// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_136A_Presents {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), count = 0;
        HashMap<Integer, Integer> record = new HashMap();
        while (sc.hasNext()) {
            int p = sc.nextInt();
            count++;
            record.put(p, count);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(record.get(i));
            if (i != n) {
                System.out.print(" ");
            }
        }
    }
}
