import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.replace("c="," ");
        input = input.replace("c-"," ");
        input = input.replace("dz="," ");
        input = input.replace("d-"," ");
        input = input.replace("lj"," ");
        input = input.replace("nj"," ");
        input = input.replace("s="," ");
        input = input.replace("z="," ");

        System.out.println(input.length());
    }
}
