// todo-核对
// WA：看不到具体输入的错误案例，
// link: https://codeforces.com/problemset/problem/2004/B

import java.util.Scanner;

public class Codeforces_2004B_Game_with_Doors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l1 = sc.nextInt(), r1 = sc.nextInt(), l2 = sc.nextInt(), r2 = sc.nextInt(), ret = 0;
            if (l2 - r1 > 1 || l1 - r2 > 1) {
                ret = 0;
            } else if (l2 - r1 == 1 || l1 - r2 == 1) {
                ret = 1;
            } else if (l2 - r1 == 0 || l1 - r2 == 0) {
                ret = 2;
            } else if (l2 - r1 < 0) {
                if (l2 < l1) {
                    if (r2 > r1) {
                        ret = r1 - l1 + 2;
                    } else if (r2 == r1) {
                        ret = r1 - l1 + 1;
                    } else {
                        ret = r2 - l1 + 2;
                    }
                } else if (l2 == l1) {
                    if (r2 > r1) {
                        ret = r1 - l1 + 1;
                    } else if (r2 == r1) {
                        ret = r1 - l1;
                    } else {
                        ret = r2 - l1 + 1;
                    }
                } else {
                    if (r2 > r1) {
                        ret = r1 - l2 + 2;
                    } else if (r2 == r1) {
                        ret = r1 - l2 + 1;
                    } else {
                        ret = r2 - l2 + 2;
                    }
                }
            } else {
                if (l1 < l2) {
                    if (r1 > r2) {
                        ret = r2 - l2 + 2;
                    } else if (r1 == r2) {
                        ret = r2 - l2 + 1;
                    } else {
                        ret = r1 - l2 + 2;
                    }
                } else if (l1 == l2) {
                    if (r1 > r2) {
                        ret = r2 - l2 + 1;
                    } else if (r1 == r2) {
                        ret = r2 - l2;
                    } else {
                        ret = r1 - l2 + 1;
                    }
                } else {
                    if (r1 > r2) {
                        ret = r2 - l1 + 2;
                    } else if (r1 == r2) {
                        ret = r2 - l1 + 1;
                    } else {
                        ret = r1 - l1 + 2;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
