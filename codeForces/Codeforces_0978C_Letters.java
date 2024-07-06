// AC: 1687 ms 
// 16700 KB
// Binary search, Using TreeMap.floorKey()
// T:O(m * logn), S:O(n)
// 
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_0978C_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long sum = 0;
        long[] dormitoryRoomCount = new long[n];
        TreeMap<Long, Integer> numToDormitroy = new TreeMap<>();
        numToDormitroy.put(0L, 0);
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            sum += a;
            dormitoryRoomCount[i] = a;
            numToDormitroy.put(sum, i + 1);
        }
        for (int i = 0; i < m; i++) {
            long b = sc.nextLong();
            long dormitoryKey = numToDormitroy.floorKey(b), roomNum = b - dormitoryKey;
            int dormitoryNum = numToDormitroy.get(dormitoryKey);
            if (b == dormitoryKey) {
                roomNum = dormitoryRoomCount[(int) (dormitoryNum - 1)];
            } else {
                dormitoryNum = dormitoryNum + 1;
            }

            System.out.println(dormitoryNum + " " + roomNum);
        }
    }
}
