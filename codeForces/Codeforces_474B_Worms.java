import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_474B_Worms {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), sum = 0, pos = 0;
        TreeMap<Integer, Integer> mapping = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            pos++;
            mapping.put(sum, pos);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt(), index;
            if (mapping.containsKey(q)) {
                index = mapping.get(q);
            } else {
                Map.Entry<Integer, Integer> entry = mapping.floorEntry(q);
                index = entry == null ? 1 : entry.getValue() + 1;
            }
            System.out.println(index);
        }
    }
}
