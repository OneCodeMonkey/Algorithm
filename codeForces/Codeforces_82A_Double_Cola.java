// AC: 202 ms
// Memory: 0 KB
// Math: 等比数列
// T:O(1), S:O(1)
// 
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Codeforces_82A_Double_Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> people = Arrays.asList("Sheldon", "Leonard", "Penny", "Rajesh", "Howard");
        int count = (int) (Math.log(n * 1.0 / 5 + 1) / Math.log(2));
        if (count == 0) {
            System.out.println(people.get(n - 1));
        } else {
            int left = n - 5 * ((int) Math.pow(2, count) - 1);
            if (left == 0) {
                System.out.println("Howard");
            } else {
                int pair = (int) Math.pow(2, count);
                String ret = people.get((int) Math.ceil(left * 1.0 / pair) - 1);
                System.out.println(ret);
            }
        }
    }
}
