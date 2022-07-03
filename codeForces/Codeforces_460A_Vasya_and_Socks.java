// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(logm(n)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_460A_Vasya_and_Socks {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), remain = 0, newGet = 0, ret = n;
        while (n > 0) {
            newGet = (n + remain) / m;
            remain = (n + remain) % m;
            ret += newGet;
            n = newGet;
        }
        System.out.println(ret);
    }
}
