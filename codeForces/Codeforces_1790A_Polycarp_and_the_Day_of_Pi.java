// AC: 202 ms 
// Memory: 0 KB
// String comparison.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1790A_Polycarp_and_the_Day_of_Pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            String n = sc.next(), pi = "314159265358979323846264338327";
            boolean flag = true;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) != pi.charAt(j)) {
                    flag = false;
                    ret = j;
                    break;
                }
            }
            System.out.println(flag ? n.length() : ret);
        }
    }
}
