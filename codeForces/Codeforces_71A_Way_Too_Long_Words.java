// AC
// 
import java.util.Scanner;

public class Codeforces_71A_Way_Too_Long_Words {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                String ret = String.valueOf(word.charAt(0)) +
                        (word.length() - 2) +
                        word.charAt(word.length() - 1);
                System.out.println(ret);
            }
        }
    }
}
