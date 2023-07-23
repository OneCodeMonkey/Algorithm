// AC: 264 ms 
// Memory: 0 KB
// hashmap
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1744A_Number_Replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Character> intToCharMapping = new HashMap<>();
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            String s = sc.next();
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                if (intToCharMapping.containsKey(arr[j]) && intToCharMapping.get(arr[j]) != c) {
                    flag = false;
                    break;
                }
                intToCharMapping.put(arr[j], c);
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
