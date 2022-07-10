// AC: 436 ms 
// Memory: 0 KB
// hashset.
// T:O(2^n), S:O(2^n)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1472B_Fair_Division {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            HashSet<Integer> record = new HashSet<>(), temp = new HashSet<>();
            for (int j = 0; j < n; j++) {
                int aI = sc.nextInt();
                sum += aI;
                temp.clear();
                for (int k : record) {
                    if (!record.contains(k + aI)) {
                        temp.add(k + aI);
                    }
                }
                record.addAll(temp);
                record.add(aI);
            }
            if (sum % 2 == 0 && record.contains(sum / 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
