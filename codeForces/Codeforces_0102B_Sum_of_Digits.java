// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0102B_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sumDigit = 0, ret = n.length() > 1 ? 1 : 0;
        for (char c : n.toCharArray()) {
            sumDigit += c - '0';
        }
        while (sumDigit >= 10) {
            int copy = sumDigit, tempSum = 0;
            while (copy > 0) {
                tempSum += copy % 10;
                copy /= 10;
            }
            sumDigit = tempSum;
            ret++;
        }
        System.out.println(ret);
    }
}
