// AC: 468 ms 
// Memory: 600 KB
// T:O(sum(ni)), S:O(1)
// math.
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1883C_Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0, countEven = 0, countOdd = 0;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record.merge(a, 1, Integer::sum);
                if (a % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            if (!record.containsKey(k)) {
                if (k == 2) {
                    ret = countEven > 0 ? 0 : 1;
                } else if (k == 3) {
                    if (!record.containsKey(6) && !record.containsKey(9)) {
                        int tmp = 2;
                        for (int key : record.keySet()) {
                            tmp = Math.min(tmp, 3 - key % 3);
                        }
                        ret = tmp;
                    }
                } else if (k == 4) {
                    if (!record.containsKey(8)) {
                        if (countEven == 0) {
                            int tmp = 3;
                            for (int key : record.keySet()) {
                                tmp = Math.min(tmp, 4 - key % 4);
                            }
                            tmp = Math.min(2, tmp);
                            ret = tmp;
                        } else if (countEven == 1) {
                            ret = 1;
                        }
                    }
                } else if (k == 5) {
                    if (!record.containsKey(10)) {
                        int tmp = 4;
                        for (int key : record.keySet()) {
                            tmp = Math.min(tmp, 5 - key % 5);
                        }
                        ret = tmp;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
