import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = Arrays.stream(arr).max().getAsInt();
        for(int i = 0; i < n; i++) {
            sum += ((double) arr[i] / max) * 100;
        }
        bw.write(String.valueOf(sum / n));
        bw.flush();
        bw.close();
    }
}