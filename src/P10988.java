import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String pInput = sb.reverse().toString();

        int answer = pInput.equals(input) ? 1 : 0;

        System.out.println(answer);
    }
}
