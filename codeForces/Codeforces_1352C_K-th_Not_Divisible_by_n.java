import java.util.Scanner;

public class Codeforces_1352C_K_th_Not_Divisible_by_n {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            if (n > k) {
                System.out.println(k);
            } else {
                int left = k + k / n, right = k + k / n;
                while (left <= right) {
                    int middle = left + (right - left) / 2, position = middle - middle / n;
                    if (position == k) {
                        System.out.println(middle);
                        break;
                    } else if (position > k) {
                        right = middle - 1;
                    } else {
                        left = middle + 1;
                    }
                }
            }
        }
    }
}
