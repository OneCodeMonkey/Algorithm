// AC: 811 ms 
// Memory: 0 KB
// Only 3 case can success: 
//    1. all Odd  
//    2. all Even 
//    3. both have Odd and Even, but the smallest even is greater than smallest odd, 
//       Thus when meet an even number a[i], make it be a[i] - minOdd to become an odd. 
// Otherwise we can not success.
// 
// T:O(sum(i)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1833C_Vlad_Building_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countOdd = 0, countEven = 0, minEven = Integer.MAX_VALUE, minOdd = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    countEven++;
                    minEven = Math.min(minEven, a);
                } else {
                    countOdd++;
                    minOdd = Math.min(minOdd, a);
                }
            }
            boolean ret = false;
            if (countOdd == 0 || countEven == 0) {
                ret = true;
            } else {
                ret = minEven > minOdd;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
