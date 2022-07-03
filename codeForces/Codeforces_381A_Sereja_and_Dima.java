// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_381A_Sereja_and_Dima {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0, leftPos = 0, rightPos = n - 1, ASum = 0, BSum = 0;
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            record[pos++] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (record[leftPos] >= record[rightPos]) {
                if (i % 2 == 0) {
                    ASum += record[leftPos++];
                } else {
                    BSum += record[leftPos++];
                }
            } else {
                if (i % 2 == 0) {
                    ASum += record[rightPos--];
                } else {
                    BSum += record[rightPos--];
                }
            }
        }
        System.out.println(ASum + " " + BSum);
    }
}
