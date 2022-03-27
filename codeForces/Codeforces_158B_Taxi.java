// AC: Time: 592 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_158B_Taxi {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        while (sc.hasNext()) {
            switch (sc.nextInt()) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                default:
            }
        }
        ret += count4 + count3 + count2 / 2;
        count1 -= Math.min(count3, count1);
        if (count2 % 2 == 1) {
            ret += 1;
            count1 -= Math.min(2, count1);
        }
        ret += (int) Math.ceil(count1 * 1.0 / 4);

        System.out.println(ret);
    }
}
