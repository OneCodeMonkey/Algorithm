import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_469A_I_Wanna_Be_the_Guy {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        HashSet<Integer> record = new HashSet<>();
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            record.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            record.add(sc.nextInt());
        }

        System.out.println(record.size() == n ? "I become the guy." : "Oh, my keyboard!");
    }
}
