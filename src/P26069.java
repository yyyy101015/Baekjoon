import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P26069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<String> dance = new HashSet<>();
        dance.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String name1 = sc.next();
            String name2 = sc.next();
            if(dance.contains(name1)) {
                dance.add(name2);
            } else if(dance.contains(name2)) {
                dance.add(name1);
            }
        }

        System.out.println(dance.size());
    }
}
