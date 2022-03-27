// AC: Time: 218 ms 
// Memory: 0 KB
// treemap
// T:O(nlogn), S:O(n)
// 
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_405A_Gravity_Flip {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), count = 0;
        TreeMap<Integer, Integer> record = new TreeMap<>();
        while (sc.hasNext()) {
            int i = sc.nextInt();
            record.merge(i, 1, Integer::sum);
        }
        for (int i : record.keySet()) {
            for (int j = 0; j < record.get(i); j++) {
                System.out.print(i);
                count++;
                if (count != n) {
                    System.out.print(" ");
                }
            }
        }
    }
}
