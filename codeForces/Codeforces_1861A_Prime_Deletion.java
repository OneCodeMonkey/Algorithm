// AC: 358 ms 
// Memory: 700 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1861A_Prime_Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String sequence = sc.next();
            int pos1 = sequence.indexOf('1'), pos2 = sequence.indexOf('3');
            System.out.println(pos1 < pos2 ? 13 : 31);
        }
    }
}
