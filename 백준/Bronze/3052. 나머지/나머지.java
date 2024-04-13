import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;
        }

        arr = Arrays.stream(arr).distinct().toArray();

        bw.write(String.valueOf(arr.length));
        bw.flush();
        bw.close();
    }
}