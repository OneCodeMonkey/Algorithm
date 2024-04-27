// AC: 280 ms 
// Memory: 1640 KB
// String: constructive, Notice if use greedy, the last remain elements should not be x.
// T:O(sum(ni / ki)), S:O(max(ni / ki))
// 
import java.util.Scanner;

public class Codeforces_1845A_Forbidden_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();
            if (x == 1 && (k == 1 || (k == 2 && n % 2 == 1))) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                StringBuilder ret = new StringBuilder();
                int count = 0;
                while (n > 0) {
                    if (k == x) {
                        int minus = Math.min(k - 1, n);
                        ret.append(minus);
                        n -= minus;
                        count++;
                    } else {
                        if (n - k == x) {
                            if (x == 1) {
                                if (n % 2 == 0) {
                                    for (int j = 0; j < n / 2; j++) {
                                        ret.append(2);
                                        if (j != n / 2 - 1) {
                                            ret.append(" ");
                                        }
                                    }
                                } else {
                                    ret.append(3);
                                    for (int j = 0; j < (n - 3) / 2; j++) {
                                        ret.append(" ");
                                        ret.append(2);
                                    }
                                }
                                count += n / 2;
                            } else {
                                for (int j = 0; j < n; j++) {
                                    ret.append(1);
                                    if (j != n - 1) {
                                        ret.append(" ");
                                    }
                                }
                                count += n;
                            }
                            break;
                        } else {
                            int minus = Math.min(k, n);
                            ret.append(minus);
                            n -= minus;
                            count++;
                        }
                    }
                    if (n > 0) {
                        ret.append(" ");
                    }
                }

                System.out.println(count);
                System.out.println(ret);
            }
        }
    }
}
