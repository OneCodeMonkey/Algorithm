// Time: 202 ms 
// Memory: 0 KB
// string.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_978B_File_Name {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), countContinousX = 0, ret = 0;
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'x') {
                countContinousX++;
            } else {
                ret += countContinousX >= 3 ? (countContinousX - 2) : 0;
                countContinousX = 0;
            }
        }
        ret += countContinousX >= 3 ? (countContinousX - 2) : 0;

        System.out.println(ret);
    }
}
