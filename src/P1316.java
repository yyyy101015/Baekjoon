import java.util.ArrayList;
import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int answer = n;

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            ArrayList<Character> characters = new ArrayList<>();
            characters.add(input.charAt(0));
            for (int j = 1; j < input.length(); j++) {
                if (input.charAt(j - 1) != input.charAt(j)) {
                    if (characters.contains(input.charAt(j))) {
                        answer -= 1;
                        break;
                    } else {
                        characters.add(input.charAt(j));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
