import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }
}