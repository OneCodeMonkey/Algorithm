// AC: 280 ms 
// Memory: 100 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1926B_Vlad_and_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), firstRowLen = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                if (ret == 0 && row.contains("1")) {
                    int countChar = 0;
                    for (char c : row.toCharArray()) {
                        if (c == '1') {
                            countChar++;
                        }
                    }
                    if (firstRowLen == 0) {
                        firstRowLen = countChar;
                    } else {
                        if (countChar != firstRowLen) {
                            ret = 1;
                        } else {
                            ret = -1;
                        }
                    }
                }
            }
            System.out.println(ret == 1 ? "TRIANGLE" : "SQUARE");
        }
    }
}
