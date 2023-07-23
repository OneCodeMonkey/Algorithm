// AC: 280 ms  
// Memory: 0 KB
// brute-force
// T:O(k * log(k)), S: O(1)
// 
import java.util.Scanner;

public class Codeforces_0919B_Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), count = 0;
        for (int i = 19; ; i++) {
            int num = i, digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            if (digitSum == 10) {
                count++;
                if (count == k) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
