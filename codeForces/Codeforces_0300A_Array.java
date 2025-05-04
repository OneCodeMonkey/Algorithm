// Time: 560 ms 
// Memory: 1000 KB
// Construct.
// T:O(n), S:O(n)
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_0300A_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), firstPosi = 0;
        List<Integer> zero = new ArrayList<>(), nega = new ArrayList<>(), posi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                zero.add(a);
            } else if (a > 0) {
                if (firstPosi == 0) {
                    firstPosi = a;
                } else {
                    zero.add(a);
                }
            } else {
                nega.add(a);
            }
        }
        if (firstPosi == 0) {
            posi.add(nega.get(0));
            posi.add(nega.get(1));
            nega = nega.subList(2, nega.size());
        } else {
            posi.add(firstPosi);
        }
        if (nega.size() % 2 == 0) {
            zero.add(nega.get(0));
            nega.remove(0);
        }

        System.out.println(nega.size());
        System.out.println(print(nega));
        System.out.println(posi.size());
        System.out.println(print(posi));
        System.out.println(zero.size());
        System.out.println(print(zero));
    }

    private static String print(List<Integer> arr) {
        StringBuilder ret = new StringBuilder();
        for (int i : arr) {
            ret.append(i);
            ret.append(" ");
        }
        return ret.toString().trim();
    }
}
