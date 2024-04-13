import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] student = new boolean[31];

        for(int i = 0; i < 28; i++) {
            student[Integer.parseInt(br.readLine())] = true;
        }
        br.close();

        for(int i = 0; i < 30; i++) {
            if(!student[i + 1]) {
                bw.write(String.valueOf(i + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}