// AC: Time: 434 ms 
// Memory: 0 KB
// .
// T:O(nlogn), S:O(n)
// 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Codeforces_160A_Twins {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), sum = 0, curSum = 0, count = 0;
        List<Integer> record = new ArrayList<>();
        while (sc.hasNext()) {
            int i = sc.nextInt();
            record.add(i);
            sum += i;
        }
        record.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : record) {
            curSum += i;
            count++;
            if (curSum * 2 > sum) {
                System.out.println(count);
                return;
            }
        }
    }
}
