// AC: 187 ms 
// Memory: 0 KB
// Factorial replace: 4! = 2! * 2!, 6! = 5! * 3!, 8! = 7! * 2! * 2! * 2!, 9! = 7! * 3! * 3! * 2!
// T:O(n), S:O(n)
//
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_0515C_Drazil_and_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == '2' || c == '3' || c == '5' || c == '7') {
                digits.add(c - '0');
            } else if (c == '4') {
                digits.add(3);
                digits.add(2);
                digits.add(2);
            } else if (c == '6') {
                digits.add(5);
                digits.add(3);
            } else if (c == '8') {
                digits.add(7);
                digits.add(2);
                digits.add(2);
                digits.add(2);
            } else if (c == '9') {
                digits.add(7);
                digits.add(3);
                digits.add(3);
                digits.add(2);
            }
        }
        digits.sort(Collections.reverseOrder());
        StringBuilder ret = new StringBuilder();
        for (int digit : digits) {
            ret.append(digit);
        }

        System.out.println(ret);
    }
}
