// AC: T:2120 ms  
// Memory: 0 KB
// .
// T:(n), S:O(line.length())
// 
import java.util.Scanner;

public class Codeforces_1B_SpreadSheet {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.nextInt();
        while (sc.hasNext()) {
            String str = sc.next();
            boolean isRCXY = false, flag = false;
            char prev = ' ';
            for (char c : str.toCharArray()) {
                if (c >= '0' && c <= '9' && (prev >= 'A' && prev <= 'Z')) {
                    if (flag) {
                        isRCXY = true;
                        break;
                    } else {
                        flag = true;
                    }
                }
                prev = c;
            }

            if (isRCXY) {
                String[] arr = str.substring(1).split("C");
                int row = Integer.parseInt(arr[0]), col = Integer.parseInt(arr[1]);
                StringBuilder colStr = new StringBuilder();
                while (col > 0) {
                    if (col % 26 == 0) {
                        colStr.append('Z');
                        col /= 26;
                        col--;
                    } else {
                        colStr.append((char) (col % 26 + 'A' - 1));
                        col /= 26;
                    }
                }
                System.out.println(colStr.reverse().toString() + row);
            } else {
                int startIndex = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        startIndex = i;
                        break;
                    }
                }
                String colStr = str.substring(0, startIndex);
                int row = Integer.parseInt(str.substring(startIndex));
                int col = 0, base = 1;
                for (int i = colStr.length() - 1; i >= 0; i--) {
                    col += (colStr.charAt(i) - 'A' + 1) * base;
                    base *= 26;
                }
                System.out.println("R" + row + "C" + col);
            }
        }
    }
}