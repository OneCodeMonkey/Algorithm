// AC: Time: 404 ms 
// Memory: 0 KB
// built-in function
// T:O(1), S:O(1)
//
import java.util.Locale;
import java.util.Scanner;

public class Codeforces_112A_Petya_and_Strings {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String first = sc.next(), second = sc.next();
        first = first.toLowerCase(Locale.ROOT);
        second = second.toLowerCase(Locale.ROOT);
        System.out.println(first.equals(second) ? 0 : (first.compareTo(second) > 0 ? 1 : -1));
    }
}
