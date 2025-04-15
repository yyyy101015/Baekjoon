import java.util.Scanner;

public class P25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[20];
        double[] rate = new double[20];
        double totalRate = 0;
        for (int i = 0; i < 20; i++) {
            String input = sc.next();
            double inputRate = sc.nextDouble();
            rate[i] = inputRate;
            totalRate += inputRate;
            String inputScore = sc.next();
            switch(inputScore) {
                case "A+":
                    score[i] = 4.5;
                    break;
                case "A0":
                    score[i] = 4.0;
                    break;
                case "B+":
                    score[i] = 3.5;
                    break;
                case "B0":
                    score[i] = 3.0;
                    break;
                case "C+":
                    score[i] = 2.5;
                    break;
                case "C0":
                    score[i] = 2.0;
                    break;
                case "D+":
                    score[i] = 1.5;
                    break;
                case "D0":
                    score[i] = 1.0;
                    break;
                case "F":
                    score[i] = 0;
                    break;
                case "P":
                    score[i] = 0;
                    totalRate -= rate[i];
                    break;
            }
        }
        double totalScore = 0;
        for (int i = 0; i < 20; i++) {
            totalScore += score[i] * rate[i];
        }
        totalScore /= totalRate;

        System.out.print(totalScore);
    }
}
