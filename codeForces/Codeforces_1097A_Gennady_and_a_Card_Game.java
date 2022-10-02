// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1097A_Gennady_and_a_Card_Game {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cardTable = sc.next(), card1 = sc.next(), card2 = sc.next(), card3 = sc.next(), card4 = sc.next(), card5 = sc.next();
        char number = cardTable.charAt(0), suit = cardTable.charAt(1);
        if (number == card1.charAt(0) || number == card2.charAt(0) || number == card3.charAt(0) ||
                number == card4.charAt(0) || number == card5.charAt(0)) {
            System.out.println("YES");
            return;
        }
        if (suit == card1.charAt(1) || suit == card2.charAt(1) || suit == card3.charAt(1) ||
                suit == card4.charAt(1) || suit == card5.charAt(1)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
