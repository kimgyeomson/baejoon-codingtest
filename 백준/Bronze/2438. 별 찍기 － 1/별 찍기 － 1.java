import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        String star = "";
        for(int i = 1; i <= n; i++) {
            star += "*";
            bw.write(star + "\n");
            bw.flush();
        }
        bw.close();
    }
}