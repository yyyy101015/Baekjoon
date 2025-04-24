import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P25192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();

        int answer = 0;
        String[] chat = new String[cnt];
        Set<String> chats = new HashSet<>();

        for (int i = 0; i < cnt; i++) {
            chat[i] = sc.nextLine();
            if (chat[i].equals("ENTER")) {
                answer += chats.size();
                chats.clear();
            } else {
                chats.add(chat[i]);
            }
        }
        answer += chats.size();

        System.out.println(answer);
    }
}
