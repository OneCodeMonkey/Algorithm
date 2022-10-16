// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_550A_Two_Substrings {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        if (s.length() >= 4) {
            List<Integer> indexAB = new LinkedList<>(), indexBA = new LinkedList<>();
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') {
                    indexAB.add(i);
                }
                if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'A') {
                    indexBA.add(i);
                }
                if (!indexAB.isEmpty() && !indexBA.isEmpty()) {
                    for (int t : indexAB) {
                        for (int k : indexBA) {
                            if (Math.abs(t - k) >= 2) {
                                System.out.println("YES");
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
