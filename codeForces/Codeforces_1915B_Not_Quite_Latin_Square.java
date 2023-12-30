// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1915B_Not_Quite_Latin_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char ret = ' ';
            for (int j = 0; j < 3; j++) {
                String row = sc.next();
                if (row.contains("?")) {
                    int sum = 0;
                    for (char c : row.toCharArray()) {
                        if (c != '?') {
                            sum += c;
                        }
                    }
                    ret = (char) ('A' + 'B' + 'C' - sum);
                }
            }
            System.out.println(ret);
        }
    }
}
