import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        double score_sum = 0;
        double score_mul = 0;

        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String title = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String rank = st.nextToken();

            double score = 0;
            if (!rank.equals("P")) {
                switch (rank) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                }
                score_sum += num;
                score_mul += num * score;
            }
        }
        bw.write(String.valueOf((score_mul / score_sum)));
        bw.flush();
        bw.close();
    }
}