// AC: 186 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1701A_Grass_Field {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), n4 = sc.nextInt();
            int countOne = n1 + n2 + n3 + n4;

            System.out.println(countOne == 0 ? 0 : (countOne == 4 ? 2 : 1));
        }
    }
}
