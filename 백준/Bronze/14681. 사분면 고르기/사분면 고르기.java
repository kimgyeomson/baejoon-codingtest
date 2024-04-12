import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        br.close();
        String n = "";
        if (x > 0 && y > 0) {
            n = "1";
        }
        else if(x < 0 && y > 0) {
            n = "2";
        }
        else if(x < 0 && y < 0) {
            n = "3";
        }
        else if(x > 0 && y < 0) {
            n = "4";
        }

        bw.write(n);
        bw.flush();
        bw.close();
    }
}