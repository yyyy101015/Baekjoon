import java.util.Scanner;

public class P2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            for(int j = 0; j < count - 1 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i  * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < count - 1; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (count - 1 - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
