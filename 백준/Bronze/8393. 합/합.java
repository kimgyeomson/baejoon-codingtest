import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        br.close();

        for(int i = 0; i < n; i++) {
            sum += i + 1;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}