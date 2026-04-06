// Time: 265 ms 
// Memory: 1200 KB
// Debug 2h 多...
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0371C_Hamburgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int na = sc.nextInt(), nb = sc.nextInt(), nc = sc.nextInt();
        int pa = sc.nextInt(), pb = sc.nextInt(), pc = sc.nextInt();
        int ca = 0, cb = 0, cc = 0;
        long ret = 0, r = sc.nextLong();
        for (char c : str.toCharArray()) {
            if (c == 'B') {
                ca++;
            } else if (c == 'S') {
                cb++;
            } else {
                cc++;
            }
        }
        int min1 = Math.min(Math.min(ca == 0 ? 0 : (na / ca), cb == 0 ? 0 : (nb / cb)), cc == 0 ? 0 : (nc / cc));
        ret += min1;
        na -= min1 * ca;
        nb -= min1 * cb;
        nc -= min1 * cc;

        while ((ca > 0 && na > 0) || (cb > 0 && nb > 0) || (cc > 0 && nc > 0)) {
            int onePkg = 0;
            if (ca > 0) {
                if (na >= ca) {
                    na -= ca;
                } else {
                    onePkg += (ca - na) * pa;
                    na = 0;
                }
            }
            if (cb > 0) {
                if (nb > cb) {
                    nb -= cb;
                } else {
                    onePkg += (cb - nb) * pb;
                    nb = 0;
                }
            }
            if (cc > 0) {
                if (nc > cc) {
                    nc -= cc;
                } else {
                    onePkg += (cc - nc) * pc;
                    nc = 0;
                }
            }

            if (r >= onePkg) {
                r -= onePkg;
                ret++;
            } else {
                break;
            }
        }
        if (r > 0) {
            int onePkg = ca * pa + cb * pb + cc * pc;
            ret += r / onePkg;
        }

        System.out.println(ret);
    }
}
