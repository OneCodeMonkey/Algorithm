// AC: 389 ms 
// Memory: 200 KB
// Check 0XX0, 2XX5, 7XX5, 5XX0, four patterns.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1593B_Make_it_Divisible_by_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            String nStr = String.valueOf(n);
            int len = nStr.length(), ret = Integer.MAX_VALUE, firstZeroPos = -1, secondZeroPos = -1, firstFivePos = -1,
                    firstFiveAfterZeroPos = -1, firstTwoAfterFivePos = -1, firstSevenAfterFivePos = -1, sign = 0;
            for (int j = len - 1; j >= 0; j--) {
                char c = nStr.charAt(j);
                if (c == '0') {
                    if (firstZeroPos == -1) {
                        firstZeroPos = j;
                        sign++;
                    } else if (secondZeroPos == -1) {
                        secondZeroPos = j;
                        sign++;
                    }
                } else if (c == '5') {
                    if (firstFivePos == -1) {
                        firstFivePos = j;
                        sign++;
                    }
                    if (firstZeroPos != -1 && firstFiveAfterZeroPos == -1) {
                        firstFiveAfterZeroPos = j;
                        sign++;
                    }
                } else if (c == '2' && firstFivePos != -1 && firstTwoAfterFivePos == -1) {
                    firstTwoAfterFivePos = j;
                    sign++;
                } else if (c == '7' && firstFivePos != -1 && firstSevenAfterFivePos == -1) {
                    firstSevenAfterFivePos = j;
                    sign++;
                }

                // no need to check other digits.
                if (sign == 6) {
                    break;
                }
            }
            if (secondZeroPos != -1) {
                ret = Math.min(ret, len - secondZeroPos - 2);
            }
            if (firstTwoAfterFivePos != -1) {
                ret = Math.min(ret, len - firstTwoAfterFivePos - 2);
            }
            if (firstSevenAfterFivePos != -1) {
                ret = Math.min(ret, len - firstSevenAfterFivePos - 2);
            }
            if (firstZeroPos != -1 && firstFiveAfterZeroPos != -1) {
                ret = Math.min(ret, len - firstFiveAfterZeroPos - 2);
            }

            System.out.println(ret);
        }
    }
}
