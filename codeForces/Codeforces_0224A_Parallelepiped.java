// AC: 372 ms 
// Memory: 0 KB
// Geometry: see area1 = a * b, area2 = a * c, area3 = b * c, then area1 = a * (area3 / area2) * a,
// then a ^ 2 = area1 * area2 / area3, same way we can get b and c.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0224A_Parallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area1 = sc.nextInt(), area2 = sc.nextInt(), area3 = sc.nextInt();
        int edge1 = (int) Math.sqrt(area1 * area2 * 1.0 / area3), edge2 = area1 / edge1, edge3 = area2 / edge1;

        System.out.println(4 * (edge1 + edge2 + edge3));
    }
}
