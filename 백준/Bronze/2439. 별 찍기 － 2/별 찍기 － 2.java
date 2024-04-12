import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String a = "";

        for(int i = 0; i < n; i++) {
            a += " ";
        }

        char c = '\0';
        String star = "";

        for(int i = 0; i < n; i++) {
            String result = a.substring(0, a.length() - (i + 1));
            star += "*";
            result += star;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}