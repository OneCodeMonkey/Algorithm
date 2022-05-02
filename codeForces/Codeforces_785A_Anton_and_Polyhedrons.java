// AC: Time: 389 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_785A_Anton_and_Polyhedrons {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        HashMap<String, Integer> record = new HashMap<>();
        record.put("Tetrahedron", 4);
        record.put("Cube", 6);
        record.put("Octahedron", 8);
        record.put("Dodecahedron", 12);
        record.put("Icosahedron", 20);
        for (int i = 0; i < n; i++) {
            ret += record.get(sc.next());
        }

        System.out.println(ret);
    }
}
