// AC: 499 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1325B_CopyCopyCopyCopyCopy {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashSet<Integer> record = new HashSet<>();
            for (int j = 0; j < n; j++) {
                record.add(sc.nextInt());
            }
            System.out.println(record.size());
        }
    }
}
