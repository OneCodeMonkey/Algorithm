// AC: 281 ms 
// Memory: 1000 KB
// Greedy.
// T:O(d), S:O(d)
// 
import java.util.Scanner;

public class Codeforces_0004B_Before_an_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(), sumTime = sc.nextInt(), sumMin = 0, sumMax = 0;
        int[] dayMin = new int[d], dayMax = new int[d];
        for (int i = 0; i < d; i++) {
            int minTime = sc.nextInt();
            int maxTime = sc.nextInt();
            dayMin[i] = minTime;
            dayMax[i] = maxTime;
            sumMin += minTime;
            sumMax += maxTime;
        }
        boolean ret = sumTime >= sumMin && sumTime <= sumMax;
        if (!ret) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int remain = sumTime - sumMin;
            StringBuilder retAnswer = new StringBuilder();

            for (int i = 0; i < d; i++) {
                int dayTime = dayMin[i];
                if (remain > 0) {
                    dayTime = Math.min(remain, dayMax[i] - dayMin[i]) + dayMin[i];
                    remain -= Math.min(remain, dayMax[i] - dayMin[i]);
                }
                retAnswer.append(dayTime);
                if (i != d - 1) {
                    retAnswer.append(" ");
                }
            }

            System.out.println(retAnswer);
        }
    }
}
