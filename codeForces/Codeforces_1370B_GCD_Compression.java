// Time: 389 ms 
// Memory: 1200 KB
// .
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1370B_GCD_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> oddIndex = new ArrayList<>(), evenIndex = new ArrayList<>();
            for (int j = 0; j < 2 * n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    evenIndex.add(j + 1);
                } else {
                    oddIndex.add(j + 1);
                }
            }
            if (oddIndex.size() % 2 == 1) {
                for (int j = 0; j < (oddIndex.size() - 1) / 2; j++) {
                    System.out.println(oddIndex.get(2 * j) + " " + oddIndex.get(2 * j + 1));
                }
                for (int j = 0; j < (evenIndex.size() - 1) / 2; j++) {
                    System.out.println(evenIndex.get(2 * j) + " " + evenIndex.get(2 * j + 1));
                }
            } else {
                for (int j = 1; j < oddIndex.size() / 2; j++) {
                    System.out.println(oddIndex.get(2 * j) + " " + oddIndex.get(2 * j + 1));
                }
                for (int j = (oddIndex.size() == 0 ? 1 : 0); j < evenIndex.size() / 2; j++) {
                    System.out.println(evenIndex.get(2 * j) + " " + evenIndex.get(2 * j + 1));
                }
            }
        }
    }
}
