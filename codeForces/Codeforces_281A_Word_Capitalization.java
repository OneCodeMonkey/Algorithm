// AC: Time: 434 ms  
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_281A_Word_Capitalization {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(Character.toUpperCase(str.charAt(0)) + str.substring(1));
    }
}
