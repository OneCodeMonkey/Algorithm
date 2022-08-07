// AC: 732 ms 
// Memory: 15600 KB
// treemap
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_456A_Laptops {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeMap<Integer, List<Integer>> record = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (record.containsKey(a)) {
                List<Integer> tempList = record.get(a);
                if (b > tempList.get(1)) {
                    tempList.set(1, b);
                } else if (b < tempList.get(0)) {
                    tempList.set(0, b);
                }
            } else {
                record.put(a, Arrays.asList(b, b));
            }
        }
        int prevQualify = 0;
        for (int i : record.keySet()) {
            if (prevQualify == 0) {
                prevQualify = record.get(i).get(1);
            } else if (prevQualify > record.get(i).get(0)) {
                System.out.println("Happy Alex");
                return;
            } else {
                prevQualify = Math.max(prevQualify, record.get(i).get(1));
            }
        }
        System.out.println("Poor Alex");
    }
}
