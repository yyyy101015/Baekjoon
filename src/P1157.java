import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] alphabet = new int[26];

        for (int i = 0; i < input.length(); i++) {
            alphabet[(int) input.charAt(i) - 65]++;
        }

        int max = -1;
        char answer = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (max == alphabet[i]) {
                answer = '?';
            } else if (max < alphabet[i]) {
                answer = (char) (i + 65);
                max = alphabet[i];
            }
        }

        System.out.println(answer);
    }
}
