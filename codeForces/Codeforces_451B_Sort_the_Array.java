// AC: 343 ms 
// Memory: 0 KB
// sort the target array, and compare with original array. If the diff subarray is non-decreasing, then it can be converted with one reversion.
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_451B_Sort_the_Array {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SC.nextInt();
        int[] arr = new int[n], arrCopy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = SC.nextInt();
            arr[i] = a;
            arrCopy[i] = a;
        }
        Arrays.sort(arrCopy);
        int diffStartPos = -1, diffEndPos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arrCopy[i]) {
                diffStartPos = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != arrCopy[i]) {
                diffEndPos = i;
                break;
            }
        }
        if (diffStartPos == -1) {
            System.out.println("yes");
            System.out.println("1 1");
        } else if (diffEndPos - diffStartPos <= 1) {
            System.out.println("yes");
            System.out.println((diffStartPos + 1) + " " + (diffEndPos + 1));
        } else {
            boolean flag = true;
            for (int i = diffStartPos; i <= diffEndPos - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
                System.out.println((diffStartPos + 1) + " " + (diffEndPos + 1));
            } else {
                System.out.println("no");
            }
        }
    }
}
