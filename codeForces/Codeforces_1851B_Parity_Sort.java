// AC: 530 ms 
// Memory: 2800 KB
// Sort.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1851B_Parity_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            boolean ret = true;
            int n = sc.nextInt();
            int[] arr = new int[n];
            List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    odd.add(a);
                } else {
                    even.add(a);
                }
                arr[j] = a;
            }
            if (!odd.isEmpty() && !even.isEmpty()) {
                Collections.sort(odd);
                Collections.sort(even);
                int posOdd = -1, posEven = -1;
                for (int j = 0; j < n; j++) {
                    if (arr[j] % 2 == 1) {
                        posOdd++;
                        if (posEven >= 0 && odd.get(posOdd) < even.get(posEven)) {
                            ret = false;
                            break;
                        }
                    } else {
                        posEven++;
                        if (posOdd >= 0 && even.get(posEven) < odd.get(posOdd)) {
                            ret = false;
                            break;
                        }
                    }
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
