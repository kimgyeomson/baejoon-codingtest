import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        String str1 = "";
        String str2 = "int";

        for(int i = 0; i < n / 4; i++) {
            str1 += "long ";
        }
        bw.write(str1 + str2);
        bw.flush();
        bw.close();
    }
}