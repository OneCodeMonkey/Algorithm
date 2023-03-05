// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1741A_Compare_T_Shirt_Sizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next(), b = sc.next(), ret = "";
            int lenA = a.length(), lenB = b.length();
            if (a.charAt(lenA - 1) != b.charAt(lenB - 1)) {
                ret = a.charAt(lenA - 1) > b.charAt(lenB - 1) ? "<" : ">";
            } else {
                ret = a.charAt(lenA - 1) == 'S' ? (lenA > lenB ? "<" : (lenA == lenB ? "=" : ">")) :
                        (lenA > lenB ? ">" : (lenA == lenB ? "=" : "<"));
            }
            System.out.println(ret);
        }
    }
}
