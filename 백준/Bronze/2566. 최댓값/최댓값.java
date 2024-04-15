import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        String a = maximum(arr);
        bw.write(a);
        bw.flush();
        bw.close();
    }

    public static String maximum(int[][] arr) {
        int max = 0;
        String str = "";
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    str = String.format("%s\n%d %d",max, i+1, j+1);
                }
            }
        }
        return str;
    }
}