import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp = 0;
        int count = 0;

        for(int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n > temp) {
                temp = n;
                count = i + 1;
            }
        }
        br.close();
        bw.write(String.valueOf(temp + "\n"));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}