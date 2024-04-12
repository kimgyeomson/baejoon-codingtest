import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(br.readLine());
        br.close();

        if(m + min >= 60) {
            h = ((m + min) / 60) + h;
            m = (m + min) % 60;
            if(h >= 24) {
                h -= 24;
            }
        }
        else if(m + min < 60) {
            m = m + min;
        }

        bw.write(String.valueOf(h + " " + m));
        bw.flush();
        bw.close();
    }
}