import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int count = st.countTokens();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a = reversInt(a);
        b = reversInt(b);

        if(a > b) {
            bw.write(String.valueOf(a));
        }
        else if(a < b) {
            bw.write(String.valueOf(b));
        }
        bw.flush();
        bw.close();

    }

    public static int reversInt(int a) {
        StringBuilder sb = new StringBuilder(String.valueOf(a)).reverse();

        return Integer.parseInt(sb.toString());
    }
}