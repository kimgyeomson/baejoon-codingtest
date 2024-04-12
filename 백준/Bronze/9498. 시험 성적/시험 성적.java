import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());
        String n = "";
        br.close();

        if (score >= 90) {
            n = "A";
        }
        else if (score >= 80) {
            n = "B";
        }
        else if (score >= 70) {
            n = "C";
        }
        else if (score >= 60) {
            n = "D";
        }
        else {
            n = "F";
        }

        bw.write(n);
        bw.flush();
        bw.close();
    }
}