// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1644A_Doors_and_Keys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean flag = true;
            HashSet<Character> keys = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    keys.add(c);
                } else {
                    switch (c) {
                        case 'R':
                            if (!keys.contains('r')) {
                                flag = false;
                                break;
                            }
                            break;
                        case 'G':
                            if (!keys.contains('g')) {
                                flag = false;
                                break;
                            }
                            break;
                        case 'B':
                            if (!keys.contains('b')) {
                                flag = false;
                                break;
                            }
                            break;
                        default:
                    }
                    if (!flag) {
                        break;
                    }
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
