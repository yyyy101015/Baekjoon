import java.util.Scanner;

public class P3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] totalChess = new int[6];
        int[] inputChess = new int[6];
        int[] answer = new int[6];
        totalChess[0] = 1;
        totalChess[1] = 1;
        totalChess[2] = 2;
        totalChess[3] = 2;
        totalChess[4] = 2;
        totalChess[5] = 8;

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < inputChess.length; i++) {
            inputChess[i] = Integer.parseInt(input[i]);
            answer[i] = totalChess[i] - inputChess[i];
            System.out.print(answer[i] + " ");
        }
    }
}
