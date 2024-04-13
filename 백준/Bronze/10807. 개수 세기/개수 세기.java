import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int search = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            if (arr[i] == search) {
                count++;
            }
        }
        br.close();
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}