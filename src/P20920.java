import java.io.*;
import java.util.*;

public class P20920 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = bf.readLine();
            if (input.length() < m) {
                continue;
            }
            if (!wordCount.containsKey(input)) {
                wordCount.put(input, 1);
            } else {
                wordCount.replace(input, wordCount.get(input) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCount.keySet());
        words.sort((w1, w2) -> {
                    if (w1.equals(w2)) {
                        return 0;
                    }
                    if (wordCount.get(w1) < wordCount.get(w2)) {
                        return 1;
                    } else if (wordCount.get(w1).equals(wordCount.get(w2))) {
                        if (w1.length() < w2.length()) {
                            return 1;
                        } else if (w1.length() == w2.length()) {
                            if (w1.compareTo(w2) > 0) {
                                return 1;
                            }
                        }
                    }
                    return -1;
                });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String s : words) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
