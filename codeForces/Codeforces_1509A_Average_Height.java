// AC: 264 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1509A_Average_Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> odd = new LinkedList<>(), even = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    odd.add(a);
                } else {
                    even.add(a);
                }
            }
            for (int j = 0; j < odd.size(); j++) {
                System.out.print(odd.get(j));
                if (j != odd.size() - 1 || !even.isEmpty()) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < even.size(); j++) {
                System.out.print(even.get(j));
                if (j != even.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
