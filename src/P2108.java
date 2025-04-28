import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int average = (int) Math.round((double) Arrays.stream(numbers).sum() / n);
        int median = numbers[n / 2];

        HashMap<Integer, Integer> modeHash = new HashMap<>();
        int maxCount = 0;
        boolean isChange = false;
        int mode = numbers[0];

        for (int number : numbers) {
            if (!modeHash.containsKey(number)) {
                modeHash.put(number, 1);
            } else {
                int count = modeHash.get(number);
                modeHash.replace(number, count + 1);
            }
            if (maxCount == modeHash.get(number) && !isChange) {
                mode = number;
                isChange = true;
            } else if (maxCount < modeHash.get(number)) {
                maxCount = modeHash.get(number);
                mode = number;
                isChange = false;
            }
        }


        int range = numbers[n - 1] - numbers[0];

        System.out.println(average + "\n" + median + "\n" + mode + "\n" + range);

    }
}
