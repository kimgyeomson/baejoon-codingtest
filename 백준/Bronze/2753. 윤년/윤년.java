import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        br.close();
        int n = 0;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            n = 1;
        }
        bw.write(String.valueOf(n));
        bw.flush();
        bw.close();
    }
}