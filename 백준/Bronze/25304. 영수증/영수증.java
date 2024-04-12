import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int money = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            sum += money * count;
        }
        if(total == sum) {
            bw.write("Yes");
        }
        else {
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }
}