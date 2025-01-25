// Time: 281 ms 
// Memory: 900 KB
// Constructive.
// T:O(sum(ki)), S:O(max(ki))
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1998A_Find_K_Distinct_Points_with_Fixed_Center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt(), sumX = x * k, sumY = y * k;
            List<Integer> xAxios = new ArrayList<>(), yAxios = new ArrayList<>();
            if (sumX > 0) {
                for (int j = k - 1; j >= 1; j--) {
                    xAxios.add(-j);
                }
                xAxios.add(k * (k - 1) / 2 + sumX);
            } else {
                for (int j = k - 1; j >= 1; j--) {
                    xAxios.add(j);
                }
                xAxios.add(-k * (k - 1) / 2 + sumX);
            }

            if (sumY > 0) {
                for (int j = k - 1; j >= 1; j--) {
                    yAxios.add(-j);
                }
                yAxios.add(k * (k - 1) / 2 + sumY);
            } else {
                for (int j = k - 1; j >= 1; j--) {
                    yAxios.add(j);
                }
                yAxios.add(-k * (k - 1) / 2 + sumY);
            }

            for (int j = 0; j < k; j++) {
                System.out.println(xAxios.get(j) + " " + yAxios.get(j));
            }
        }
    }
}
