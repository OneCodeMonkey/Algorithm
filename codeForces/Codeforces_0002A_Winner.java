// AC: 528 ms 
// Memory: 0 KB
// Hashmap.
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_0002A_Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), maxScore = 0;
        HashMap<String, Integer> nameSore = new HashMap<>();
        List<String> record = new LinkedList<>();
        for (int i = 0; i < t; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            nameSore.merge(name, score, Integer::sum);
            record.add(name + "#" + score);
        }
        for (String key : nameSore.keySet()) {
            maxScore = Math.max(maxScore, nameSore.get(key));
        }
        HashSet<String> names = new HashSet<>();
        for (String key : nameSore.keySet()) {
            if (nameSore.get(key).equals(maxScore)) {
                names.add(key);
            }
        }
        nameSore.clear();
        for (String item : record) {
            String[] arr = item.split("#");
            String name = arr[0];
            int score = Integer.parseInt(arr[1]);
            nameSore.merge(name, score, Integer::sum);
            if (nameSore.get(name) >= maxScore && names.contains(name)) {
                System.out.println(name);
                return;
            }
        }
    }
}
