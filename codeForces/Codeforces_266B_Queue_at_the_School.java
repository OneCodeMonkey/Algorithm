// AC: Time: 404 ms 
// Memory: 0 KB
// simulation
// T:O(n * t), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_266B_Queue_at_the_School {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), t = sc.nextInt();
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < t; i++) {
            boolean changed = false;
            for (int j = arr.length - 1; j >= 1; j--) {
                if (arr[j] == 'G' && arr[j - 1] == 'B') {
                    arr[j] = 'B';
                    arr[j - 1] = 'G';
                    changed = true;
                    j--;
                }
            }
            if (!changed) {
                break;
            }
        }

        System.out.println(new String(arr));
    }
}
