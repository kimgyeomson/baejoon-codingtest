import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i < 10; i++) {
            bw.write(String.valueOf(n + " * " + i + " = " + (n * i)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}