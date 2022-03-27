// AC: Time: 186 ms 
// Memory: 0 KB
// . 
// T:O(n), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1030A_In_Search_of_an_Easy_Problem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.nextInt();
        while (sc.hasNext()) {
            if (sc.nextInt() == 1) {
                System.out.println("HARD");
                return;
            }
        }

        System.out.println("EASY");
    }
}
