import java.util.Arrays;
import java.util.Scanner;

public class P1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] meas = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            meas[i] = sc.nextInt();
        }
        Arrays.sort(meas);

        System.out.println(meas[0] * meas[meas.length-1]);
    }
}
