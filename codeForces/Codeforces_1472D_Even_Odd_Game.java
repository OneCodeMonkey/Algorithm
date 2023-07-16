// AC: 545 ms 
// Memory: 2700 KB
// Sort & greedy.
// T:O(sum(nlogn)), S:O(max(n))
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1472D_Even_Odd_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    even.add(a);
                } else {
                    odd.add(a);
                }
            }
            Collections.sort(even);
            Collections.sort(odd);
            int evenIndex = even.size() - 1, oddIndex = odd.size() - 1, turn = 0;
            long aliceValue = 0, bobValue = 0;
            while (evenIndex != -1 || oddIndex != -1) {
                int value1 = evenIndex != -1 ? even.get(evenIndex) : 0;
                int value2 = oddIndex != -1 ? odd.get(oddIndex) : 0;
                if (turn++ % 2 == 0) {
                    if (value1 > value2) {
                        aliceValue += value1;
                        evenIndex--;
                    } else {
                        oddIndex--;
                    }
                } else {
                    if (value2 > value1) {
                        bobValue += value2;
                        oddIndex--;
                    } else {
                        evenIndex--;
                    }
                }
            }

            System.out.println(aliceValue > bobValue ? "Alice" : (aliceValue == bobValue ? "Tie" : "Bob"));
        }
    }
}
