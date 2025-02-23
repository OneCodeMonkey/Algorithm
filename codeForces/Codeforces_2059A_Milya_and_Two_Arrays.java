// Time: 437 ms 
// Memory: 1300 KB
// 因为是每个元素必有两个，那么任意一遍 distinct >= 3 即可成立。只需讨论两边同时 distint <= 2 情况，可知必须 distinc 同时 == 2.
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_2059A_Milya_and_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashSet<Integer> setA = new HashSet<>(), setB = new HashSet<>();
            for (int j = 0; j < n; j++) {
                setA.add(sc.nextInt());
            }
            for (int j = 0; j < n; j++) {
                setB.add(sc.nextInt());
            }

            System.out.println(setA.size() * setB.size() >= 3 ? "YES" : "NO");
        }
    }
}
