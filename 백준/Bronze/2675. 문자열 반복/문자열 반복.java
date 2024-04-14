import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            String r = strRep(a, b);
            bw.write(r + "\n");
        }
        bw.flush();
        bw.close();
    }
    public static String strRep(int a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b.length(); i++) {
            for(int j = 0; j < a; j++) {
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }
}