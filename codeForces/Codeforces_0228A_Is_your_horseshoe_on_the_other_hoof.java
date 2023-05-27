// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_0228A_Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt();
        HashSet<Integer> record = new HashSet<>(Arrays.asList(s1, s2, s3, s4));
        System.out.println(4 - record.size());
    }
}
