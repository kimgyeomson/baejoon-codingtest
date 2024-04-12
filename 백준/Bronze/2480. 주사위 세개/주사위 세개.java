import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());
        int sum = 0;

        if(n1 == n2 && n2 == n3) {
            sum = 10000 + n1 * 1000;
        }
        if(n1 != n2 && n2 != n3 && n3 != n1) {
            if (n1 > n2 && n1 > n3) {
                sum = n1 * 100;
            }
            if (n2 > n3 && n2 > n1) {
                sum = n2 * 100;
            }
            if(n3 > n1 && n3 > n2){
                sum = n3 * 100;
            }
        }
        if(n1 == n2 && n1 != n3) {
            sum = 1000 + n1 * 100;
        }
        if(n2 == n3 && n2 != n1) {
            sum = 1000 + n2 * 100;
        }
        if(n3 == n1 && n3 != n2) {
            sum = 1000 + n3 * 100;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
    }
}