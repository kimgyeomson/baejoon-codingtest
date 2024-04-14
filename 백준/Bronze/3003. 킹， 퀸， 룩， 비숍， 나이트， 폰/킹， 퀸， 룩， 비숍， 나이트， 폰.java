import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] diff = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            diff[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        int[] results = result(arr, diff);
        for(int i = 0; i < results.length; i++) {
            bw.write(results[i] + " ");
        }
        bw.flush();
        bw.close();
    }

    public static int[] result(int[] arr, int[] diff) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            res[i] = arr[i] - diff[i];
        }
        return res;
    }
}