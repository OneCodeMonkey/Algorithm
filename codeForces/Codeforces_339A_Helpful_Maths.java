// AC: Time: 372 ms  
// Memory: 0 KB
// sort
// T:O(nlogn), S:O(n),  n is number of summands.
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_339A_Helpful_Maths {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        List<Integer> record = new ArrayList<>();
        for (String item : str.split("\\+")) {
            record.add(Integer.parseInt(item));
        }
        Collections.sort(record);
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < record.size(); i++) {
            ret.append(record.get(i));
            if (i != record.size() - 1) {
                ret.append("+");
            }
        }

        System.out.println(ret);
    }
}
