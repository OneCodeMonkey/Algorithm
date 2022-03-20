// AC: Time: 372 ms  
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_263A_Beautiful_Matrix {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        while (sc.hasNext()) {
            int i = sc.nextInt();
            count++;
            if (i == 1) {
                break;
            }
        }
        int row = (int) Math.ceil(count * 1.0 / 5), col = count % 5 == 0 ? 5 : (count % 5);
        System.out.println(Math.abs(row - 3) + Math.abs(col - 3));
    }
}
